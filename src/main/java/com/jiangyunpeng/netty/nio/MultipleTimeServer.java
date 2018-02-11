package com.jiangyunpeng.netty.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by user on 2018/2/6.
 */
public class MultipleTimeServer implements Runnable{
    private Selector selector;
    private ServerSocketChannel serverChannel;
    private volatile boolean stop;
    private int readBytes;

    public MultipleTimeServer(int port) {
        try {
            selector = Selector.open();
            serverChannel = ServerSocketChannel.open();
            serverChannel.configureBlocking(false); // 异步非阻塞模式
            serverChannel.socket().bind(new InetSocketAddress(port),1024); //backlog
            serverChannel.register(selector, SelectionKey.OP_ACCEPT); // 将seversocket 注册到selector 监听 op_accept 操作位
            System.out.println("the time server started ! port 8080");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public void run() {
        while(!stop) {
            try {
                selector.select(1000); // 休眠时间为1s
                Set<SelectionKey> selectionKeys = selector.selectedKeys(); // 当有就绪的channel时候 返回selectionkeys
                Iterator<SelectionKey> it = selectionKeys.iterator();
                SelectionKey key = null;
                while (it.hasNext()){
                    key = it.next();
                    it.remove();
                    try {
                        hanleInput(key); // 进行网络读写
                    } catch (IOException e) {
                        e.printStackTrace();
                        if (key!= null){
                            key.cancel();
                            if (key.channel() != null)
                                key.channel().close();
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (selector != null){
            try {
                selector.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void hanleInput(SelectionKey key) throws IOException {
        if (key.isValid()){
            if (key.isAcceptable()) { // 处理新接入客户端的请求消息
                ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
                SocketChannel sc = ssc.accept(); // 三次握手 建立连接
                sc.configureBlocking(false);
                sc.register(selector, SelectionKey.OP_READ);  //
            }
            if (key.isReadable()){ // 读取客户的请求消息
                SocketChannel sc = (SocketChannel) key.channel();
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);// 分配缓冲区大小
                try {
                    readBytes = sc.read(byteBuffer);
                } catch (IOException e) {
                    if (key!= null){
                        key.cancel();
                        if (key.channel() != null)
                            key.channel().close();
                    }
                }
                if (readBytes > 0){
                    byteBuffer.flip(); // 将当前的limit 设置为position position 设置
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);
                    String body = new String(bytes,"UTF-8");
                    System.out.println("the time server recived order :" + body);
                    String currentTime = "query time order".equalsIgnoreCase(body)?new Date(System.currentTimeMillis()).toString():"bad order";
                    doWrite(sc,currentTime);
                }else if (readBytes <0){
                    key.cancel();
                    sc.close();
                }else {
                    ;
                }
            }
        }
    }

    private void doWrite(SocketChannel channel, String currentTime) throws IOException {
        if (currentTime != null && !"".equals(currentTime.trim())){
            byte[] bytes =currentTime.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            channel.write(writeBuffer);
        }
    }

    public void stop(){
        this.stop = true;
    }





}
