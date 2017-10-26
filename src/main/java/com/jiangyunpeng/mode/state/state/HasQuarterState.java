package com.jiangyunpeng.mode.state.state;

/**
 * Created by jyp on 2017/10/18.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("已经有硬币！");
    }


    public void ejectQuarter() {
        System.out.println("Quarter returned ");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("you turned ...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    public void dispense() {
        System.out.println("no gumball dispensed");
    }
}
