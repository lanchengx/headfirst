package com.example.headfirst.command.simple.invoker;

import com.example.headfirst.command.simple.command.Command;

/**
 * @Author: lanchengx
 * @Date: 2020/4/28 0028
 */
public class SimpleInvoker {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }
    public void excuteCommand(){
        command.execute();
    }
}
