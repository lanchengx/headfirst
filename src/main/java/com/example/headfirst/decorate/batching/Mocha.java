package com.example.headfirst.decorate.batching;

import com.example.headfirst.decorate.component.Beverage;
import com.example.headfirst.decorate.component.CondimentDecorator;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:44
 * @Description: 摩卡配料
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", mocha";
    }

    @Override
    public double cost() {
        return 0.25 + beverage.cost();
    }
}
