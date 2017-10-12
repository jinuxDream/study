package com.jiangyunpeng.mode.modemethod;

/**
 * Created by jyp on 2017/10/12.
 */
public class Test {

    public static void main(String[] args) {
        CoffeineBeverage coffee= new Coffee();
        coffee.prepareRecipe();

        CoffeineBeverage tea= new Tea();
        tea.prepareRecipe();
    }
}
