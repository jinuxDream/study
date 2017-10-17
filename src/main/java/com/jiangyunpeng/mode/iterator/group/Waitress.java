package com.jiangyunpeng.mode.iterator.group;

/**
 * Created by jyp on 2017/10/17.
 */
public class Waitress {

    MenuComponent menuComponent;

    public Waitress(MenuComponent menuComponent) {
        this.menuComponent = menuComponent;
    }

    public void printMenu(){
        menuComponent.print();
    }
}
