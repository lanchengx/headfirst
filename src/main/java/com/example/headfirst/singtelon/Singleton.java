package com.example.headfirst.singtelon;

/**
 * @Author: lanchengx
 * @Date: 2020/4/27 0027
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
