package com.example.headfirst.decorate.coffee;

import com.example.headfirst.decorate.component.Beverage;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:26
 * @Description: 浓缩咖啡   制作成品咖啡配料
 */
public class EspressoCoffee extends Beverage {
    public EspressoCoffee() {
        description = "Espresso";
    }

    /**
     * 返回价格
     * @return
     */
    @Override
    public double cost() {
        return 1.99;
    }
}
