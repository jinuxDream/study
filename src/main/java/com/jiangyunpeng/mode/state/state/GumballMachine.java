package com.jiangyunpeng.mode.state.state;

/**
 * Created by jyp on 2017/10/18.
 */
public class GumballMachine {

    private NoQuarterState noQuarterState;
    private HasQuarterState hasQuarterState;
    private SoldState soldState;
    private NoQuarterState soldOutState;

    int count;
    State currentState;

    public GumballMachine(int number) {

    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(NoQuarterState noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(HasQuarterState hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }

    public NoQuarterState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(NoQuarterState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }
}
