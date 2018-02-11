package com.jiangyunpeng.netty.nio;

/**
 * Created by user on 2018/2/6.
 */
public class TimeServer {
    public static void main(String[] args) {
        int port = 8080;

        MultipleTimeServer timeServer = new MultipleTimeServer(port);
        new Thread(timeServer,"NIO-multipleexertimeServer-001").start();
    }
}
