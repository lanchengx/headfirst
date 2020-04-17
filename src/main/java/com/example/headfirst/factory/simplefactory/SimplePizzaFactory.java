package com.example.headfirst.factory.simplefactory;

import com.example.headfirst.factory.simplefactory.pizza.CheesePizza;
import com.example.headfirst.factory.simplefactory.pizza.ClamPizza;
import com.example.headfirst.factory.simplefactory.pizza.Pepperoni;
import com.example.headfirst.factory.simplefactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * 简单工厂
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new Pepperoni();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
