package com.jiangyunpeng.netty.nio2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.Date;

/**
 * Created by user on 2018/2/6.
 */
public class ReadCompletionHandler implements CompletionHandler<Integer, ByteBuffer> {
    private AsynchronousSocketChannel chennel;
    public ReadCompletionHandler(AsynchronousSocketChannel chennel) {
        if (this.chennel == null){
            this.chennel = chennel;
        }
    }

    public void completed(Integer result, ByteBuffer attachment) {
        attachment.flip();
        byte[] body = new byte[attachment.remaining()];
        attachment.get(body);
        try {
            String req = new String(body,"UTF-8");
            System.out.println("the time server receive order :" + req);
            String currentTime = "query time order".equalsIgnoreCase(req)?new Date(System.currentTimeMillis()).toString():"bad order";
            doWrite(currentTime);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void doWrite(String currentTime) {
        if (currentTime != null && currentTime.trim().length() > 0){
            byte[] bytes = currentTime.getBytes();
            ByteBuffer writeBuffer = ByteBuffer.allocate(bytes.length);
            writeBuffer.put(bytes);
            writeBuffer.flip();
            chennel.write(writeBuffer, writeBuffer, new CompletionHandler<Integer, ByteBuffer>() {
                public void completed(Integer result, ByteBuffer attachment) {
                    if (attachment.hasRemaining()){
                        chennel.write(attachment,attachment,this);
                    }
                }

                public void failed(Throwable exc, ByteBuffer attachment) {
                    try {
                        chennel.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    public void failed(Throwable exc, ByteBuffer attachment) {
        try {
            this.chennel.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
