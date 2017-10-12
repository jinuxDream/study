package com.jiangyunpeng.mode.observer;

/**
 * Created by jyp on 2017/10/10.
 */
public class StaticDisplay implements Observer,DisplayElement {

    private int temperature;
    private int humidity;
    private Subject weatherData;

    public StaticDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(int temperature, int humidify, int pressure) {
        this.temperature = temperature;
        this.humidity = humidify;
        display();
    }

    public void display() {
        System.out.println("static dispay : " + temperature + " F and humidity :" + humidity);
    }
}
