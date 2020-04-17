package com.example.headfirst.observer.javaobserver;


import lombok.Data;

import java.util.Observable;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/9 23:19
 * @Description: 天气数据  通过继承Observable
 */
@Data
public class WeatherData extends Observable {

    /**
     * 温度
     */
    private float temperature;
    /**
     * 适度
     */
    private float humidity;
    /**
     * 压强
     */
    private float pressure;

    /**
     * 数据变化时
     */
    public void measurementsChanged(){
        // 调用notifyObservers 时先调用setChanged 标识状态已经改变
        setChanged();
        notifyObservers();
    }


    public void setMeasurements(float temperature, float humidity, float pressure){
        this.setHumidity(humidity);
        this.setTemperature(temperature);
        this.setPressure(pressure);
        measurementsChanged();
    }
}
