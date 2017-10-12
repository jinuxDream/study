package com.jiangyunpeng.mode.observer;

/**
 * Created by jyp on 2017/10/10.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void notifyObservers();
}
