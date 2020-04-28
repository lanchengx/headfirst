package com.example.headfirst.factory.simplefactory;

import com.example.headfirst.factory.simplefactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17  22:54
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }



}
