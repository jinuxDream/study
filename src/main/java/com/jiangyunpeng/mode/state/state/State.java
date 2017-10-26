package com.jiangyunpeng.mode.state.state;

/**
 * Created by jyp on 2017/10/18.
 */
public interface State {

    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
