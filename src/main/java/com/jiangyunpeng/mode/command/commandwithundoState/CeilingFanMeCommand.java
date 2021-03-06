package com.jiangyunpeng.mode.command.commandwithundoState;

/**
 * Created by jyp on 2017/10/12.
 */
public class CeilingFanMeCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMeCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        System.out.println(" uuuudddddoooo ");
        if (prevSpeed == CeilingFan.HIGH){
            ceilingFan.high();
        }else if (prevSpeed == CeilingFan.MEDIUM){
            ceilingFan.medium();
        }else if (prevSpeed == CeilingFan.LOW){
            ceilingFan.low();
        }else if (prevSpeed == CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}
