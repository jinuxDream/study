package com.jiangyunpeng.mode.command.commandwithundoState;

/**
 * Created by jyp on 2017/10/12.
 */
public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    String lcation;
    int speed;


    public CeilingFan(String lcation) {
        this.lcation = lcation;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println("high ");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println("medium ");
    }

    public void low(){
        speed = LOW;
        System.out.println("low ");
    }

    public void off(){
        speed = OFF;
        System.out.println("off ");
    }

    public int getSpeed(){
        System.out.println(" speed :  " + speed);
        return speed;
    }
}
