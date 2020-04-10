package com.example.headfirst.decorate.batching;

import com.example.headfirst.decorate.component.Beverage;
import com.example.headfirst.decorate.component.CondimentDecorator;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:44
 * @Description: 牛奶配料
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.70 + beverage.cost();
    }
}
