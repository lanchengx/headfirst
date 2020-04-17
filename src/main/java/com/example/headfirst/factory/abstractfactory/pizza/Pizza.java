package com.example.headfirst.factory.abstractfactory.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: lanchengx
 */
public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;

    public List toppings = new ArrayList();

    public void prepare(){
        System.out.println("preparing : " + name);
        System.out.println("Tossing dough" + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: " );
        for (Object topping : toppings) {
            System.out.println("  " + topping);
        }
    }
    public void bake(){
        System.out.println("bake for 25 min at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices ");
    }
    public void box(){
        System.out.println("Place pizza in official Pizza StoreBox");
    }

    public String getName() {
        return name;
    }
}
