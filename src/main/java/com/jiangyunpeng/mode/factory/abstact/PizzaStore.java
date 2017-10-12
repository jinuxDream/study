package com.jiangyunpeng.mode.factory.abstact;

/**
 * Created by jyp on 2017/10/11.
 */
public abstract class PizzaStore {

    Pizza pizza;


    public Pizza orderPizza(String type){
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }

    public abstract Pizza createPizza(String type);
}