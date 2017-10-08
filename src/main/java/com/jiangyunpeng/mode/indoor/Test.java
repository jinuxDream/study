package com.jiangyunpeng.mode.indoor;

/**
 * Created by jyp on 2017/10/8.
 */
public class Test {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlayBehavior(new FlyNoWay());
        duck.setQuackBehavior(new QuackWithMouth());
        duck.platformFlay();
        duck.platformQuack();
    }

}
