package com.example.headfirst.observer.myobserver;

import com.example.headfirst.observer.myobserver.subject.impl.WeatherData;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/9 23:37
 * @Description:
 */
public class main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticasDisplay statisticasDisplay = new StatisticasDisplay(weatherData);

        weatherData.setMeasurements(78, 89 ,33);
        weatherData.setMeasurements(38, 79 ,12);
    }
}
