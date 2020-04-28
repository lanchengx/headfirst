package com.example.headfirst.factory.abstractfactory.pizza.chicagopizza;

import com.example.headfirst.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017 22:50
 */
public class ChicagoPepperoni extends Pizza {
    public ChicagoPepperoni() {
        // 纽约披萨有自己的特点
        name = "ny style sauce an Chicago Pepperoni ";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara ";

        toppings.add("Shredded Mozzarealla  Cheese ");
    }
    @Override
    public void prepare() {
        System.out.println("Chicago Pepperoni Prepare" );
    }
}
