package com.jiangyunpeng.mode.threadmodels.future;

/**
 * Created by user on 2018/1/23.
 */
public class RealData implements Data{
    private final String result;

    public RealData(String result) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0;i<10;i++ ){
            stringBuffer.append(result);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.result = stringBuffer.toString();
    }

    @Override
    public String getResult() {
        return result;
    }
}
