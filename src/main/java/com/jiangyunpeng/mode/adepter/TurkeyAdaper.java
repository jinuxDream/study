package com.jiangyunpeng.mode.adepter;

/**
 * 双向适配器
 * Created by jyp on 2017/10/12.
 */
public class TurkeyAdaper implements Duck,Turkey {
    Turkey turkey = null;
    Duck duck = null;

    public TurkeyAdaper(Duck duck) {
        this.duck = duck;
    }

    public TurkeyAdaper(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (turkey != null)turkey.fly();
        if (duck != null)duck.fly();
    }
}
