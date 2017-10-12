package com.jiangyunpeng.mode.factory.abstact;

/**
 * Created by jyp on 2017/10/11.
 */
public class Test {

    public static void main(String[] args) {
        NyPizzaStore nyPizzaStore = new NyPizzaStore();
        nyPizzaStore.orderPizza("1");
        nyPizzaStore.orderPizza("2");

        BjPizzaStore bjPizzaStore = new BjPizzaStore();
        bjPizzaStore.orderPizza("1");
        bjPizzaStore.orderPizza("2");
    }

}
