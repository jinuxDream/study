package com.jiangyunpeng.mode.command.commandwithundo;

import java.util.Arrays;

/**
 * Created by jyp on 2017/10/12.
 */
public class RemoteContolWithUndo {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteContolWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i=0;i<7;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    public void setCommand(int slot,Command onComand,Command offCommand){
        onCommands[slot] = onComand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(int slot){
        undoCommand.undo();
    }

    @Override
    public String toString() {
        return "RemoteContolWithUndo{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                ", undoCommand=" + undoCommand +
                '}';
    }
}
