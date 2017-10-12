package com.jiangyunpeng.mode.modemethod;

/**
 * Created by jyp on 2017/10/12.
 */
public class Tea extends CoffeineBeverage {
    protected void pourInCup() {
        System.out.println("Tea ---");
    }

    protected void addCondiments() {
        System.out.println("add ningmeng...");
    }
}
