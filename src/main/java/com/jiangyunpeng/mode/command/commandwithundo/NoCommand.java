package com.jiangyunpeng.mode.command.commandwithundo;

/**
 * Created by jyp on 2017/10/12.
 */
public class NoCommand implements Command {
    public void execute() {
        System.out.println("not commandwithundo execute");
    }

    public void undo() {
        System.out.println("not commandwithundo undo");
    }
}
