package com.jiangyunpeng.mode.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jyp on 2017/10/10.
 */
public class WeatherData extends Observable {
    private int temperature;
    private int humidify;
    private int pressure;

    public WeatherData() {

    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(int temperature,int humidify,int pressure){
        this.temperature = temperature;
        this.humidify = humidify;
        this.pressure = pressure;
        measurementsChanged();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidify() {
        return humidify;
    }

    public void setHumidify(int humidify) {
        this.humidify = humidify;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}
