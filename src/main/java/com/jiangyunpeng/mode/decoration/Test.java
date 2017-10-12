package com.jiangyunpeng.mode.decoration;

/**
 * Created by jyp on 2017/10/10.
 */
public class Test {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " cost:" + beverage.cost() + "$");

        Beverage beverage1= new HouseBlend();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " cost:" + beverage1.cost() + "$");


    }


}
