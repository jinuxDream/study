package com.jiangyunpeng.mode.threadmodels.future;

/**
 * Created by user on 2018/1/23.
 */
public class Client {

    public Data request(final String requestStr){
        final FutureData futureData = new FutureData();
        new Thread(){
            @Override
            public void run(){
                RealData realData = new RealData(requestStr);
                futureData.setRealData(realData);
            }
        }.start();
        return futureData;
    }

}
