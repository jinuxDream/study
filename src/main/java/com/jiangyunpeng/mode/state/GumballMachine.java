package com.jiangyunpeng.mode.state;

/**
 * Created by jyp on 2017/10/17.
 */
public class GumballMachine {

    final static int SOLD_OUT = 0;
    final static int NO_QUARTER = 1;
    final static int HAS_QUARTER = 2;
    final static int SOLD = 3;

    int state = SOLD_OUT;
    int count =0 ;

    public GumballMachine(int count) {
        this.count = count;
        if (this.count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){
        if (state == HAS_QUARTER){
            System.out.println("can.t insert anOther coin! ");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("insert a quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("can t  sold out !!!");
        }else if (state == SOLD){
            System.out.println("please wait ! we  are ready give you a gumball !");
        }
    }

    public void ejectQuarer(){
        if (state == HAS_QUARTER){
            System.out.println("can.t insert anOther coin! ");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("insert a quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("can t  sold out !!!");
        }else if (state == SOLD){
            System.out.println("please wait ! we  are ready give you a gumball !");
        }
    }

    public void turnCrank(){
        if (state == HAS_QUARTER){
            System.out.println("can.t insert anOther coin! ");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("insert a quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("can t  sold out !!!");
        }else if (state == SOLD){
            System.out.println("please wait ! we  are ready give you a gumball !");
        }
    }

    public void dispense(){
        if (state == HAS_QUARTER){
            System.out.println("can.t insert anOther coin! ");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("insert a quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("can t  sold out !!!");
        }else if (state == SOLD){
            System.out.println("please wait ! we  are ready give you a gumball !");
        }
    }
}
