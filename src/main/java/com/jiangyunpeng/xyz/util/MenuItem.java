package com.jiangyunpeng.xyz.util;

/**
 * Created by jyp on 2017/10/17.
 */
public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }

    public void print(){
        System.out.println("name" + getName());
        if (isVegetarian()){
            System.out.println("vegetable!");
        }
        System.out.println("price " + getPrice());
        System.out.println("description " + getDescription() );
    }
}
