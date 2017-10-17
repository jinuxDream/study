package com.jiangyunpeng.mode.iterator;

/**
 * 菜单二
 * 数组实现
 * Created by jyp on 2017/10/16.
 */
public class Menu2 {

    int length = 10;
    Integer [] menu2s = new Integer[length];
    int idx;

    public Menu2() {
        for (int i = 0; i< 10;i++) {
            addItem(i,new Integer(i));
        }
    }

    public void addItem(int idx,Integer menu2){
        menu2s[idx] = menu2;
    }

    public Integer getItem(int idx){
        return menu2s[idx];
    }

    public MyItrator createItrator(){
        return new Menu2Itrator(this);
    }
}
