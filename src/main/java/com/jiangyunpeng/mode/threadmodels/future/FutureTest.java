package com.jiangyunpeng.mode.threadmodels.future;

/**
 * Created by user on 2018/1/23.
 */
public class FutureTest {

    public static void main(String[] args) throws InterruptedException {
        Client c = new Client();
        Data futureData = c.request("TEST-");
        System.out.println("request down !");
        Thread.sleep(500);
        System.out.println("other down !");
        System.out.println("result : " + futureData.getResult());

    }
}
