package com.example.headfirst.command.simple.command;

import com.example.headfirst.command.simple.entity.Light;

/**
 * @Author: lanchengx
 * @Date: 2020/4/27 0027
 */
public class LightOnCommand implements Command {
    /**
     * 电灯对象
     */
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
