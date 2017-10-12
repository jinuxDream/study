package com.jiangyunpeng.mode.command;

/**
 * Created by jyp on 2017/10/12.
 */
public class
Test {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        LightOncommand lightOncommand = new LightOncommand(light);

        simpleRemoteControl.setCommand(lightOncommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
