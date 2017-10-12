package com.jiangyunpeng.mode.factory.method;

/**
 * Created by jyp on 2017/10/11.
 */
public class BjStore extends PizzaStore {
    public Pizza createPizza(String type) {
        return new BJStylePizza();
    }
}
