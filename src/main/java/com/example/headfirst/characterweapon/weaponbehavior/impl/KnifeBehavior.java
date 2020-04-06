package com.example.headfirst.characterweapon.weaponbehavior.impl;

import com.example.headfirst.characterweapon.weaponbehavior.WeaponBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:30
 * @Description: 匕首
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void userWeapon() {
        System.out.println("用匕首刺");
    }
}
