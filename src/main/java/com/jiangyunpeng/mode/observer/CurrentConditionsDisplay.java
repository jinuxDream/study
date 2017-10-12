package com.jiangyunpeng.mode.observer;

/**
 * Created by jyp on 2017/10/10.
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private int temperature;
    private int humidity;
    private Subject WeatherData;

    public CurrentConditionsDisplay(Subject WeatherData) {
        this.WeatherData = WeatherData;
        WeatherData.registerObserver(this);
    }

    public void update(int temperature, int humidify, int pressure) {
        this.temperature = temperature;
        this.humidity = humidify;
        display();
    }

    public void display() {
        System.out.println("currentconditions temperature : " + temperature + " F and humidity :" + humidity);
    }
}
