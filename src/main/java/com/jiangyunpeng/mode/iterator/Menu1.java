package com.jiangyunpeng.mode.iterator;

import java.util.ArrayList;

/**
 * 菜单一 默认array实现
 * Created by jyp on 2017/10/16.
 */
public class Menu1 {

    ArrayList array = new ArrayList();

    public Menu1() {
        addItem(new Integer(1));
        addItem(new Integer(2));
        addItem(new Integer(3));
        addItem(new Integer(4));
    }

    public void addItem(Object o){
        array.add(o);
    }

    public ArrayList getMenu() {
        return array;
    }

    public MyItrator createItrator(){
        return new Menu1Itrator(this);
    }
}
