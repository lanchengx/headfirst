package com.example.headfirst.characterweapon.weaponbehavior.impl;

import com.example.headfirst.characterweapon.weaponbehavior.WeaponBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:31
 * @Description:
 */
public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("用弓箭射");
    }
}
