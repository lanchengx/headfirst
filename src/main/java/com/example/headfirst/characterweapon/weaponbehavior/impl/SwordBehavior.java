package com.example.headfirst.characterweapon.weaponbehavior.impl;

import com.example.headfirst.characterweapon.weaponbehavior.WeaponBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:30
 * @Description: 剑
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("用宝剑挥舞");
    }
}
