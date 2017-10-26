package com.jiangyunpeng.mode.state;

/**
 * Created by jyp on 2017/10/17.
 */
public class GumballMachine {

    final static int SOLD_OUT = 0; // 售光
    final static int NO_QUARTER = 1; // 没有投币
    final static int HAS_QUARTER = 2; // 有币
    final static int SOLD = 3; // 出售

    int state = SOLD_OUT;
    int count =0 ;

    public GumballMachine(int count) {
        this.count = count;
        if (this.count > 0){
            state = NO_QUARTER;
        }
    }

    // 投币
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

    // 退币
    public void ejectQuarer(){
        if (state == HAS_QUARTER){
            System.out.println("Quarer return！");
            state = NO_QUARTER;
        }else if (state == NO_QUARTER){
            System.out.println("have not inter Quarer!");
        }else if (state == SOLD_OUT){
            System.out.println("SOLD_OUT");
        }else if (state == SOLD){
            System.out.println("SOLD");
            state = NO_QUARTER;
        }else if (state == NO_QUARTER){
            System.out.println("you have not insert a quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("you can,eject you have not insert a quarter yet!");
        }else if (state == SOLD){
            System.out.println("sorry you have already turned the crank");

        }
    }

    // 转动曲柄
    public void turnCrank(){
        if (state == HAS_QUARTER){
            System.out.println("转动了  ");
            state = SOLD;
            dispense();
        }else if (state == NO_QUARTER){
            System.out.println("turned but no quarter ");
        }else if (state == SOLD_OUT){
            System.out.println("turned but no Gumball !");
        }else if (state == SOLD){
            System.out.println("turned twice need another Quarter!");
            System.out.println("you turned ...");
            state = SOLD;
            dispense();
        }else if (state == NO_QUARTER){
            System.out.println("you turned but there is no quarter !");
        }else if (state == SOLD_OUT){
            System.out.println("you turned but there is no gumballs !");
        }else if (state == SOLD){
            System.out.println("turning twice does not get you another gumball!");
        }
    }

    // 发放糖果
    public void dispense(){
        if (state == HAS_QUARTER){
            System.out.println("not gumball dispensed! ");
        }else if (state == NO_QUARTER){
            state = HAS_QUARTER;
            System.out.println("need pay");
        }else if (state == SOLD_OUT){
            System.out.println("没有糖果出售");
        }else if (state == SOLD){
            count-- ;
            if (count == 0){
                System.out.println("sold out");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
                System.out.println("sold Ok");

                System.out.println("you need pay first");
            }
        }else if (state == SOLD_OUT){
            System.out.println("no gumball dispensed ");
        }else if (state == SOLD){
            System.out.println("a gumball comes rolling out the slot");
            count--;
            if (count == 0){
                System.out.println("Oops out of gumballs ");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        }
    }
}
