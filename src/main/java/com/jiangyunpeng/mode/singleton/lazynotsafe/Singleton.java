package com.jiangyunpeng.mode.singleton.lazynotsafe;

/**
 * 懒汉，线程不安全
 * Created by jyp on 2017/10/7.
 */
public class Singleton {
    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
