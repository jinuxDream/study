package com.jiangyunpeng.mode.command.commandwithundo;

/**
 * Created by jyp on 2017/10/12.
 */
public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
