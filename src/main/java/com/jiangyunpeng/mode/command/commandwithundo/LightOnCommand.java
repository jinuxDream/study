package com.jiangyunpeng.mode.command.commandwithundo;

/**
 * Created by jyp on 2017/10/12.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
