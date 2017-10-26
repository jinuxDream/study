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
        System.out.println("退出硬币成功!");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("转动了 手柄 ！");
    }

    public void dispense() {
        gumballMachine.count-- ;
        if (gumballMachine.count == 0){
            System.out.println("已经售空！");
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            System.out.println("出售一件 ok");
        }
    }
}
