package com.example.headfirst.command.simple.command;

import com.example.headfirst.command.simple.entity.Stereo;

/**
 * @Author: lanchengx
 * @Date: 2020/4/28 0028
 */
public class StereoPlayCommand implements Command{

    Stereo stereo;

    public StereoPlayCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD("myCD");
        stereo.setVolume(11);
    }
}
