package com.example.headfirst.factory.abstractfactory.store;


import com.example.headfirst.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
