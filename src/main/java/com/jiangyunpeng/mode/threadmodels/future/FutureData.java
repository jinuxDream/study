package com.jiangyunpeng.mode.threadmodels.future;

/**
 * Created by user on 2018/1/23.
 */
public class FutureData implements Data{

    private RealData realData = null;
    private boolean isReady = false;

    public synchronized void setRealData(RealData realData){
        if (isReady){
            return;
        }
        this.realData = realData;
        isReady = true;
        notify();
    }

    @Override
    public synchronized String getResult() {
        while (!isReady){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return realData.getResult();
    }
}
