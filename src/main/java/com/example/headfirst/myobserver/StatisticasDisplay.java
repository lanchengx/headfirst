package com.example.headfirst.myobserver;

import com.example.headfirst.myobserver.dispayelement.DisplayElement;
import com.example.headfirst.myobserver.observer.Observer;
import com.example.headfirst.myobserver.subject.impl.WeatherData;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/9 23:28
 * @Description: 天气预报
 */
public class StatisticasDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // 构造是保存WeatherData 对象方便remove
    public StatisticasDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Statisticas Display :" + temperature + " & humidity is : " + humidity);
    }

    /**
     * 将温度和湿度保存起来
     * @param temperature
     * @param humidity
     * @param pressure
     */
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        // 当前实例在此处调用display
        display();
    }
}
