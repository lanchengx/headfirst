package com.example.headfirst.javaobserver;



/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 0:03
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
