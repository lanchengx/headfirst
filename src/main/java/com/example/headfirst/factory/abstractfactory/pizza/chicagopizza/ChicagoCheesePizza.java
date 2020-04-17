package com.example.headfirst.factory.abstractfactory.pizza.chicagopizza;

import com.example.headfirst.factory.abstractfactory.pizza.Pizza;

/**
 * @Author: lanchengx
 * @Date: 2020/4/17 0017 22:49
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        // 纽约披萨有自己的特点
        name = "ny style sauce an Chicago cheese pizza ";
        dough = "Extra Thick Crust Dough";
        sauce = "Marinara ";

        toppings.add("Shredded Mozzarealla  Cheese ");
    }

    @Override
    public void prepare() {
        System.out.println("Chicago cheese pizza Prepare" );
    }


}
