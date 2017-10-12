package com.jiangyunpeng.mode.factory.method;

/**
 * Created by jyp on 2017/10/11.
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyStore();
        PizzaStore bjStore = new BjStore();

        Pizza pizza = nyStore.orderPizza("");
        System.out.println("pizza  nyStore" + pizza.getName());

        System.out.println("======================");
        pizza = bjStore.orderPizza("");
        System.out.println("pizza  bjStore" + pizza.getName());
    }
}
