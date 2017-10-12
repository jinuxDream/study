package com.jiangyunpeng.mode.adepter;

/**
 * 双向适配器测试
 * Created by jyp on 2017/10/12.
 */
public class Test {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        TurkeyAdaper turkeyAdaper = new TurkeyAdaper(turkey);
        TurkeyAdaper turkeyAdaper1 = new TurkeyAdaper(new MallardDuck());
      /*  turkeyAdaper.quack();
        turkeyAdaper.fly();*/

        testDuck(new MallardDuck());
        testDuck(turkeyAdaper);

        System.out.println();
        testTurkey(turkeyAdaper1);
        testTurkey(new WildTurkey());
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
