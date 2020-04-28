package com.example.headfirst.command.simple;

import com.example.headfirst.command.simple.command.LightOnCommand;
import com.example.headfirst.command.simple.entity.Light;
import com.example.headfirst.command.simple.invoker.SimpleInvoker;

/**
 * @Author: lanchengx
 * @Date: 2020/4/28 0028
 */
public class main {

    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleInvoker invoker = new SimpleInvoker();
        invoker.setCommand(lightOnCommand);

        invoker.excuteCommand();
    }
}
