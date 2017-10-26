package com.jiangyunpeng.mode.state.state;

/**

 * Created by jyp on 2017/10/23.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("please wait we are ready giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("sorry you are already turned the crank");
    }

    public void turnCrank() {
        System.out.println("turing twice dose not get you another gumball");
    }

    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }
    }
}
