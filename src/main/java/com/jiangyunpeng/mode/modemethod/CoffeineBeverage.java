package com.jiangyunpeng.mode.modemethod;

/**
 * Created by jyp on 2017/10/12.
 */
public abstract class CoffeineBeverage {

    final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        // 加钩子
        if (test()) {
            addCondiments();
        }
    }

    protected boolean test(){
        return true;
    }

    protected void boilWater(){
        System.out.println("boilWater ...");
    }

    protected abstract void pourInCup();

    protected void brew(){
        System.out.println("brew ...");
    }

    protected abstract void addCondiments();

}
