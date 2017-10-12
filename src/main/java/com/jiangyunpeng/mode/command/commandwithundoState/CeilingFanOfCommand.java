package com.jiangyunpeng.mode.command.commandwithundoState;

/**
 * Created by jyp on 2017/10/12.
 */
public class CeilingFanOfCommand implements Command{
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOfCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
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
