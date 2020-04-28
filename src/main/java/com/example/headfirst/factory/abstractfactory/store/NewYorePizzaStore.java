package com.example.headfirst.factory.abstractfactory.store;

import com.example.headfirst.factory.abstractfactory.pizza.Pizza;
import com.example.headfirst.factory.abstractfactory.pizza.newyorkpizza.NewYorkCheesePizza;
import com.example.headfirst.factory.abstractfactory.pizza.newyorkpizza.NewYorkClamPizza;
import com.example.headfirst.factory.abstractfactory.pizza.newyorkpizza.NewYorkPepperoni;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017
 */
public class NewYorePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("newyorkcheesepizza")){
            pizza = new NewYorkCheesePizza();
        } else if (type.equals("newyorkclampizza")) {
            pizza = new NewYorkClamPizza();
        } else if (type.equals("newyorkpepperoni")) {
            pizza = new NewYorkPepperoni();
        }
        return pizza;
    }
}
