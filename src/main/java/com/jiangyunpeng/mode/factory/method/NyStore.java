package com.jiangyunpeng.mode.factory.method;

/**
 * Created by jyp on 2017/10/11.
 */
public class NyStore extends PizzaStore {
    public Pizza createPizza(String type) {
        return new NYStylePizza();
    }
}
