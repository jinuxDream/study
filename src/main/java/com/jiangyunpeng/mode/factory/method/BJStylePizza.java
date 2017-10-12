package com.jiangyunpeng.mode.factory.method;

/**
 * Created by jyp on 2017/10/11.
 */
public class BJStylePizza extends Pizza {

    public BJStylePizza() {
        name = "BJStylePizza";
        dough = "dough bj";
        sauce = "sauce bj";
        toppings.add("topping 4");
        toppings.add("topping 5");
    }

    public void cut(){
        System.out.println("cut bj bj bj ... ");
    }
}
