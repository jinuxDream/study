package com.jiangyunpeng.mode.factory.method;

/**
 * 工厂方法
 * 用集成 或 实现
 * 来代替硬编码if else
 * Created by jyp on 2017/10/11.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

    public abstract Pizza createPizza(String type);
}
