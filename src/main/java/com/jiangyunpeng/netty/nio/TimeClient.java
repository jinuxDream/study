package com.jiangyunpeng.netty.nio;

/**
 * // Address already in use: no further information
 * 1000 968
 * Created by user on 2018/2/6.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;

        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            new Thread(new TimeClientHandle("127.0.0.1",port),"TimeClient-001").start();
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗时间 ：" + (end - begin) );
    }

}
