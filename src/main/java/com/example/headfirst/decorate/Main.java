package com.example.headfirst.decorate;

import com.example.headfirst.decorate.batching.Milk;
import com.example.headfirst.decorate.batching.Mocha;
import com.example.headfirst.decorate.coffee.ComprehensiveCoffee;
import com.example.headfirst.decorate.coffee.DeepRoastingCoffee;
import com.example.headfirst.decorate.coffee.EspressoCoffee;
import com.example.headfirst.decorate.component.Beverage;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:54
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        // 订一杯 Espresso  不需要配料 打印出描述和价格
        Beverage espressoCoffee = new EspressoCoffee();
        System.out.println(espressoCoffee.getDescription() + " $ " + espressoCoffee.cost());

        // 制作一杯 deepRoastingCoffee 增加配料mocha 和 milk
        Beverage deepRoastingCoffee = new DeepRoastingCoffee();
        deepRoastingCoffee = new Mocha(deepRoastingCoffee);
        deepRoastingCoffee = new Milk(deepRoastingCoffee);
        System.out.println(deepRoastingCoffee.getDescription() + " $ " + deepRoastingCoffee.cost());
    }
}
