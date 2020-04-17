package com.example.headfirst.observer.myobserver.subject;

import com.example.headfirst.observer.myobserver.observer.Observer;

/**
 * 主题
 */
public interface Subject {
    /**
     * 注册为观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     */
    void removerObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
