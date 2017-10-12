package com.jiangyunpeng.mode.command;

/**
 * Created by jyp on 2017/10/12.
 */
public class SimpleRemoteControl {

    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed(){
        command.execute();
    }
}
