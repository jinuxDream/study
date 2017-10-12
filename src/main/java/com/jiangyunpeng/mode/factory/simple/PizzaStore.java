package com.jiangyunpeng.mode.factory.simple;

/**
 * 简单工厂 不同pizza 不同实现
 * 类型区分
 * 硬编码选择
 * Created by jyp on 2017/10/11.
 */
public class PizzaStore {

    public Pizza salePizza(int type){
        Pizza pizza;

        if (1 == type){
            pizza = new ClamPizza();
            pizza.createPizza();
        }else if (2 == type){
            pizza = new VeggiePizza();
            pizza.createPizza();
        }else{
            System.out.println("no pizza");
            return null;
        }
        return pizza;
    }

    public static void main(String[] args) {
        new PizzaStore().salePizza(1);
        new PizzaStore().salePizza(2);
        new PizzaStore().salePizza(3);
    }
}
