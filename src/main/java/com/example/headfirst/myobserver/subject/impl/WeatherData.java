package com.example.headfirst.myobserver.subject.impl;

import com.example.headfirst.myobserver.observer.Observer;
import com.example.headfirst.myobserver.subject.Subject;
import lombok.Data;

import java.util.ArrayList;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/9 23:19
 * @Description: 天气数据
 */
@Data
public class WeatherData implements Subject {

    /**
     * 观察者列表
     */
    private ArrayList<Observer> observers;


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

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i > 0 ){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.setHumidity(humidity);
        this.setTemperature(temperature);
        this.setPressure(pressure);
        notifyObserver();
    }
}
