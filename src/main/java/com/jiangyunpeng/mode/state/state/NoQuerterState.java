package com.jiangyunpeng.mode.state.state;

/**
 * Created by jyp on 2017/10/23.
 */
public class NoQuerterState implements State {

    GumballMachine gumballMachine;

    public NoQuerterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("you inserted a quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("you have not inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("you turned but there is no quarter");
    }

    public void dispense() {
        System.out.println("you need pay first");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }
}
