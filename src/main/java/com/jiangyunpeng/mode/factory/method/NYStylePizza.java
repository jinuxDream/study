package com.jiangyunpeng.mode.factory.method;

/**
 * Created by jyp on 2017/10/11.
 */
public class NYStylePizza extends Pizza {

    public NYStylePizza() {
        name = "NYStylePizza";
        dough = "dough ny";
        sauce = "sauce ny";
        toppings.add("topping 1");
        toppings.add("topping 2");
    }
}
