package com.jiangyunpeng.mode.threadmodels.threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by user on 2018/2/28.
 */
public class ThreadPool {

    public static void func1(){

        ExecutorService threadpool1 = Executors.newCachedThreadPool();
//        ExecutorService threadpool2 = Executors.newFixedThreadPool(10,);
//        ExecutorService threadpool3 = Executors.newScheduledThreadPool()
        ExecutorService threadpool4 = Executors.newSingleThreadExecutor();

    }

}
