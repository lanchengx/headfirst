package com.example.headfirst.characterweapon.weaponbehavior.impl;

import com.example.headfirst.characterweapon.weaponbehavior.WeaponBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:31
 * @Description: 斧头
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void userWeapon() {
        System.out.println("用斧头劈砍");
    }
}
