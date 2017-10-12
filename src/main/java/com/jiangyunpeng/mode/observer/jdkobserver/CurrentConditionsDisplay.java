package com.jiangyunpeng.mode.observer.jdkobserver;

import com.jiangyunpeng.mode.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jyp on 2017/10/10.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private int temperature;
    private int humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void display() {
        System.out.println("currentconditions temperature : " + temperature + " F and humidity :" + humidity);
    }

    public void update(Observable observable, Object o) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidify();
            display();
        }
    }
}
