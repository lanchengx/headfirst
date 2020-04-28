package com.example.headfirst.factory.abstractfactory.store;

import com.example.headfirst.factory.abstractfactory.pizza.Pizza;
import com.example.headfirst.factory.abstractfactory.pizza.chicagopizza.ChicagoCheesePizza;
import com.example.headfirst.factory.abstractfactory.pizza.chicagopizza.ChicagoClamPizza;
import com.example.headfirst.factory.abstractfactory.pizza.chicagopizza.ChicagoPepperoni;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("chicagocheesepizza")){
            pizza = new ChicagoCheesePizza();
        } else if (type.equals("chicagoclampizza")) {
            pizza = new ChicagoClamPizza();
        } else if (type.equals("chicagopepperoni")) {
            pizza = new ChicagoPepperoni();
        }
        return pizza;
    }
}
