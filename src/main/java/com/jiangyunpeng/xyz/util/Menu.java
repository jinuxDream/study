package com.jiangyunpeng.xyz.util;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by jyp on 2017/10/17.
 */
public class Menu extends MenuComponent{

    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i){
        return (MenuComponent) menuComponents.get(i);
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public void print(){
        System.out.println("name" + getName());
        System.out.println("description " + getDescription() );
        System.out.println("====================");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }
}
