package com.example.headfirst.decorate.batching;

import com.example.headfirst.decorate.component.Beverage;
import com.example.headfirst.decorate.component.CondimentDecorator;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:44
 * @Description: 奶泡配料
 */
public class MilkFoam extends CondimentDecorator {
    Beverage beverage;

    public MilkFoam(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", MilkFoam";
    }

    @Override
    public double cost() {
        return 0.40 + beverage.cost();
    }
}
