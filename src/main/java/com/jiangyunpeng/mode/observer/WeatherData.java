package com.jiangyunpeng.mode.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题实现类
 * Created by jyp on 2017/10/10.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private int temperature;
    private int humidify;
    private int pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(temperature,humidify,pressure);
        }
    }

    public void measurementsChange(){
        notifyObservers();
    }

    public void setMeasurements(int temperature,int humidify,int pressure){
        this.temperature = temperature;
        this.humidify = humidify;
        this.pressure = pressure;
        measurementsChange();
    }
}
