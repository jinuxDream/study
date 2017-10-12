package com.jiangyunpeng.mode.observer;

/**
 * Created by jyp on 2017/10/10.
 */
public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);
        weatherData.setMeasurements(80,65,90);
        weatherData.setMeasurements(70,75,60);
        weatherData.setMeasurements(60,66,90);
        weatherData.setMeasurements(60,66,90);
    }
}
