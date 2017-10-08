package com.jiangyunpeng.mode.indoor;

/**
 * Created by jyp on 2017/10/8.
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        setFlayBehavior(new FlyBehavior() {
            public void fly() {
                
            }
        });
    }
}
