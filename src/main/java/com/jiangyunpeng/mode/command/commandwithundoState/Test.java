package com.jiangyunpeng.mode.command.commandwithundoState;

/**
 * Created by jyp on 2017/10/12.
 */
public class Test {

    public static void main(String[] args) {

        RemoteContolWithUndo contolWithUndo = new RemoteContolWithUndo();
        CeilingFan ceilingFan = new CeilingFan("living room");

        CeilingFanHiCommand ceilingFanHiCommand = new CeilingFanHiCommand(ceilingFan);
        CeilingFanMeCommand ceilingFanMeCommand = new CeilingFanMeCommand(ceilingFan);
        CeilingFanLoCommand ceilingFanLoCommand = new CeilingFanLoCommand(ceilingFan);
        CeilingFanOfCommand ceilingFanOfCommand = new CeilingFanOfCommand(ceilingFan);


        contolWithUndo.setCommand(0,ceilingFanMeCommand,ceilingFanOfCommand);
        contolWithUndo.setCommand(1,ceilingFanHiCommand,ceilingFanOfCommand);

        contolWithUndo.onButtonWasPushed(0);
        contolWithUndo.offButtonWasPushed(0);
        contolWithUndo.undoButtonWasPushed();


        contolWithUndo.onButtonWasPushed(1);
        contolWithUndo.undoButtonWasPushed();


    }
}
