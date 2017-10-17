package com.jiangyunpeng.mode.iterator;

/**
 * Created by jyp on 2017/10/16.
 */
public class Menu1Itrator implements MyItrator {
    Menu1 menu1 = new Menu1();
    int idx;
    public Menu1Itrator(Menu1 menu1) {
        this.menu1 = menu1;
        idx = 0;
    }

    public boolean hasNext() {
        return idx < menu1.getMenu().size();
    }

    public Object next() {
        Object o = menu1.getMenu().get(idx);
        idx++;
        return o;
    }
}
