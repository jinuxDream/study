package com.jiangyunpeng.mode.threadmodels.future.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by user on 2018/3/1.
 */
public class TestCachedThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i< 100 ;i++){
            executorService.execute(new TestRunnable());
            System.out.println(" i ： " + i);
        }
        executorService.shutdown();
    }
}

class TestRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + "  "+ Thread.currentThread().getName() + "被调用了");
    }
}