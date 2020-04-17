package com.example.headfirst.factory.abstractfactory.pizza.newyorkpizza;


import com.example.headfirst.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017 22:49
 */
public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza() {
        // 纽约披萨有自己的特点
        name = "ny style sauce an cheese pizza ";
        dough = "Thin crust Dough";
        sauce = "Marinara ";

        toppings.add("Grate Reggiano Cheese ");
    }
}
