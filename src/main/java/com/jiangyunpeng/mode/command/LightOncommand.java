package com.jiangyunpeng.mode.command;

/**
 * Created by jyp on 2017/10/12.
 */
public class LightOncommand implements Command{
    Light light;

    public LightOncommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
