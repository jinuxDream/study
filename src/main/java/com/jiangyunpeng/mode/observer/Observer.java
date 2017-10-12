package com.jiangyunpeng.mode.observer;

/**
 * Created by jyp on 2017/10/10.
 */
public interface Observer {
    void update(int temperature, int humidify, int pressure);
}
