package com.jiangyunpeng.mode.factory.method;

import java.util.ArrayList;

/**
 * Created by jyp on 2017/10/11.
 */
public abstract class Pizza {
    
    String name; // 名称
    String dough; // 面团
    String sauce; // 酱料
    ArrayList toppings = new ArrayList(); //
    
    public void prepare() {
        System.out.println("prepareing " + name);
        System.out.println("tossing dough " + dough);
        System.out.println("add sauce " + sauce);
        System.out.println("add toppings ...");
        for (int i = 0; i < toppings.size();i++){
            System.out.println("topings : " + toppings.get(i));
        }
    }

    public void bake() {
        System.out.println("bake .....");
    }

    public void cut() {
        System.out.println("cut .....");
    }

    public void box() {
        System.out.println("box .....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }
}
