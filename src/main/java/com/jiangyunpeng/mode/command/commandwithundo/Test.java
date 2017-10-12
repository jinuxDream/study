package com.jiangyunpeng.mode.command.commandwithundo;

/**
 * Created by jyp on 2017/10/12.
 */
public class Test {

    public static void main(String[] args) {
        RemoteContolWithUndo remoteContolWithUndo = new RemoteContolWithUndo();
        Light livingRoomLight = new Light();

        LightOnCommand lightOncommandOn = new LightOnCommand(new Light());
        LightOffCommand lightOffcommandOff = new LightOffCommand(new Light());

        remoteContolWithUndo.setCommand(0,lightOncommandOn,lightOffcommandOff);

        remoteContolWithUndo.onButtonWasPushed(0);
        remoteContolWithUndo.offButtonWasPushed(0);
        System.out.println(remoteContolWithUndo);
        remoteContolWithUndo.undoButtonWasPushed(0);


        remoteContolWithUndo.offButtonWasPushed(0);
        remoteContolWithUndo.onButtonWasPushed(0);
        System.out.println(remoteContolWithUndo);
        remoteContolWithUndo.undoButtonWasPushed(0);

        remoteContolWithUndo.offButtonWasPushed(1);
        remoteContolWithUndo.onButtonWasPushed(1);
        System.out.println(remoteContolWithUndo);
        remoteContolWithUndo.undoButtonWasPushed(1);
    }

}
