package com.jiangyunpeng.mode.decoration;

/**
 * 浓缩咖啡
 * Created by jyp on 2017/10/10.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffe";
    }

    public double cost() {
        return 1.99;
    }
}
