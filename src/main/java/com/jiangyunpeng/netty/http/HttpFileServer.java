package com.jiangyunpeng.netty.http;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;

/**
 * Created by user on 2018/2/11.
 */
public class HttpFileServer {

    private static final String DEFAULT_URL = "/";
    String filePath = "C:\\Users\\user\\src\\netty"; //System.getProperty("user.dir")

    public void run(final int port,final String url){
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        ServerBootstrap b = new ServerBootstrap();
        b.group(bossGroup,workerGroup)
                .channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    protected void initChannel(SocketChannel ch) throws Exception {
                        ch.pipeline().addLast("http-decoder",new HttpRequestDecoder());
                        ch.pipeline().addLast("http-aggregator",new HttpObjectAggregator(65536));
                        ch.pipeline().addLast("http-encoder",new HttpResponseEncoder());
                        ch.pipeline().addLast("http-chunked",new ChunkedWriteHandler());
                        ch.pipeline().addLast("fileServerHandler",new HttpFileServerHandler(url,filePath));
                    }
                });
        try {
            ChannelFuture future = b.bind("192.168.0.118",port).sync();
            System.out.println("http 文件目录服务器启动，网址: http://192.168.0.118:" + port + url);
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        int port = 8080;
        String url = DEFAULT_URL;
        new HttpFileServer().run(port,url);
    }
}
