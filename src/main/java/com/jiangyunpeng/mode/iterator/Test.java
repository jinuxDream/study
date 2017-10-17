package com.jiangyunpeng.mode.iterator;

/**
 * 测试自定义迭代器
 * Created by jyp on 2017/10/16.
 */
public class Test {

    public static void main(String[] args) {
/*        Menu1Itrator menu1Itrator = new Menu1Itrator(new Menu1());
        Menu2Itrator menu2Itrator = new Menu2Itrator(new Menu2());
        while(menu1Itrator.hasNext()){
            System.out.println("迭代器一 : " + menu1Itrator.next());
        }
        while (menu2Itrator.hasNext()) {
            System.out.println("迭代器二 : " + menu2Itrator.next());
        }*/

        MyItrator myItrator = new Menu1().createItrator();
        MyItrator myItrator1 = new Menu2().createItrator();
        while (myItrator.hasNext()){
            System.out.println("迭代器一 : " + myItrator.next());
        }

        while (myItrator1.hasNext()){
            System.out.println("迭代器二 : " + myItrator1.next());
        }
    }
}
