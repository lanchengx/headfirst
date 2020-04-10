package com.example.headfirst.decorate.component;

import com.example.headfirst.decorate.component.Beverage;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:23
 * @Description: 调料装饰者 抽象类
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * 所有装饰者需要重新实现Description
     * @return
     */
    @Override
    public abstract  String getDescription() ;
}
