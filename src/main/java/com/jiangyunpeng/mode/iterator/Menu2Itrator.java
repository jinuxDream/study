package com.jiangyunpeng.mode.iterator;

/**
 * Created by jyp on 2017/10/16.
 */
public class Menu2Itrator implements MyItrator{

    Menu2 menu2;
    int idx = 0;

    public Menu2Itrator(Menu2 menu2) {
        this.menu2 = menu2;
        idx = 0;
    }

    public boolean hasNext() {
        return idx < menu2.length;
    }

    public Object next() {
        Integer menu2 = this.menu2.menu2s[idx];
        idx ++;
        return menu2;
    }
}
