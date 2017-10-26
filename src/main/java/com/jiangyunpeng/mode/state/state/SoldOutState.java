package com.jiangyunpeng.mode.state.state;

/**
 * Created by jyp on 2017/10/23.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("can not sold out!!!");
    }

    public void ejectQuarter() {
        System.out.println("you can not eject you have not insert a quarter yet!");
    }

    public void turnCrank() {
        System.out.println("you turned but there is no gumballs !");
    }

    public void dispense() {
        System.out.println("no gumball dispensed ");
    }
}
