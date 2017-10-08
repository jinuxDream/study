package com.jiangyunpeng.mode.singleton.hungry;

/**
 * 饿汉
 * Created by jyp on 2017/10/7.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
