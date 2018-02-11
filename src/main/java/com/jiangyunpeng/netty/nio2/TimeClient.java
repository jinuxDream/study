package com.jiangyunpeng.netty.nio2;

/**
 * 10000 1540
 * Created by user on 2018/2/6.
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        System.out.println("消耗时间 ：" + 111);
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            new Thread(new AsyncTimeClientHandler("127.0.0.1", port), "AIO-AsyncTimeClientHandler").start();
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗时间 ：" + (end - begin) +"=============================================================");
        System.out.println("=============================================================================");
    }
}
