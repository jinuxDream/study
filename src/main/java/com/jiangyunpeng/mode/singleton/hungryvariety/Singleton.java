package com.jiangyunpeng.mode.singleton.hungryvariety;

/**
 * 饿汉 变种
 * Created by jyp on 2017/10/7.
 */
public class Singleton {
    private static Singleton instance = null;
    static {
        instance = new Singleton();
    }
    private Singleton (){}
    public static Singleton getInstance() {
        return instance;
    }
}
