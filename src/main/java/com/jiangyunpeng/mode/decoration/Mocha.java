package com.jiangyunpeng.mode.decoration;

/**
 * 摩卡
 * Created by jyp on 2017/10/10.
 */
public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+", mocha";
    }

    public double cost() {
        return .23 + beverage.cost();
    }
}
