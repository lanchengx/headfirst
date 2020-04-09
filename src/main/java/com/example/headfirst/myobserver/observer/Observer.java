package com.example.headfirst.myobserver.observer;

/**
 * 观察者实现接口
 */
public interface Observer {
    /**
     * 更新
     */
    void update(float temperature, float humidity, float pressure);
}
