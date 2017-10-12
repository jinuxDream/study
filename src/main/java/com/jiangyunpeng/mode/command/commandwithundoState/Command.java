package com.jiangyunpeng.mode.command.commandwithundoState;

/**
 * Created by jyp on 2017/10/12.
 */
public interface Command {

    void execute();
    void undo();
}
