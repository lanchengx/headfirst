package com.example.headfirst.factory.abstractfactory;

import com.example.headfirst.factory.abstractfactory.pizza.Pizza;
import com.example.headfirst.factory.abstractfactory.store.ChicagoPizzaStore;
import com.example.headfirst.factory.abstractfactory.store.NewYorePizzaStore;
import com.example.headfirst.factory.abstractfactory.store.PizzaStore;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017
 */
public class main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NewYorePizzaStore();
        PizzaStore chStore = new ChicagoPizzaStore();

        Pizza nyPizza = nyStore.orderPizza("newyorkcheesepizza");
        System.out.println(nyPizza.getName());

        Pizza chPizza = chStore.orderPizza("chicagoclampizza");
        System.out.println(nyPizza.getName());
    }

}
