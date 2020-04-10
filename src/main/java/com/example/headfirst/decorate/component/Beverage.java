package com.example.headfirst.decorate.component;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/10 22:19
 * @Description: 饮料抽象类型
 */
public abstract class Beverage {
    /**
     * 饮料描述
     */
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 成本计算方法
     * @return
     */
    public abstract double cost();

}
