package com.jiangyunpeng.mode.modemethod;

/**
 * Created by jyp on 2017/10/12.
 */
public class Coffee extends CoffeineBeverage {
    protected void pourInCup() {
        System.out.println("coffee ---");
    }

    protected void addCondiments() {
        System.out.println("add milk and sugger");
    }

    @Override
    protected boolean test() {
        return false;
    }
}
