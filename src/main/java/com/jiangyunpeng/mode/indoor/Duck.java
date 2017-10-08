package com.jiangyunpeng.mode.indoor;

/**
 * 鸭类
 * Created by jyp on 2017/10/8.
 */
public class Duck {

    private FlyBehavior flayBehavior;

    private QuackBehavior quackBehavior;

    public void setFlayBehavior(FlyBehavior flayBehavior) {
        this.flayBehavior = flayBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void platformQuack(){
        quackBehavior.quack();
    }

    public void platformFlay(){
        flayBehavior.fly();
    }

    public void swim(){
        System.out.println("dispaly swim!");
    }

    public void display(){
        System.out.println("display duck!");
    }

}
