package com.example.headfirst.javaobserver;

import com.example.headfirst.myobserver.dispayelement.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/9 23:55
 * @Description: 天气预报
 */
public class StatisticasDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    // 构造是保存WeatherData 对象方便remove
    public StatisticasDisplay(Observable observable) {
        this.observable = observable;
        // 将当前对象注册为观察者
        observable.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("statistic display:" + temperature + " & humidity is : " + humidity);
    }

    @Override
    public void update(Observable obs, Object arg) {
        // obs 为 WeatherData类型
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            // 获取温度  湿度
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    /**
     * 将温度和湿度保存起来
     * @param temperature
     * @param humidity
     * @param pressure
     */

}
