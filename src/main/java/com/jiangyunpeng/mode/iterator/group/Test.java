package com.jiangyunpeng.mode.iterator.group;

/**
 * Created by jyp on 2017/10/17.
 */
public class Test {

    public static void main(String[] args) {

        MenuComponent menuComponent1 = new Menu("menu1","menu 111");
        MenuComponent menuComponent2 = new Menu("menu2","menu 222");
        MenuComponent menuComponent3 = new Menu("menu3","menu 333");
        MenuComponent menuComponent4 = new Menu("menu11","menu 11 --1");

        MenuComponent menuComponents = new Menu("all menu","alllllllll");
        menuComponents.add(menuComponent1);
        menuComponents.add(menuComponent2);
        menuComponents.add(menuComponent3);
        menuComponent3.add(menuComponent4);

        Waitress waitress = new Waitress(menuComponents);
        waitress.printMenu();
    }
}
