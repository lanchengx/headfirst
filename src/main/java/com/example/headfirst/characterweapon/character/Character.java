package com.example.headfirst.characterweapon.character;

import com.example.headfirst.characterweapon.weaponbehavior.WeaponBehavior;
import lombok.Getter;
import lombok.Setter;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:26
 * @Description: 角色
 */
public abstract class Character {


    WeaponBehavior weaponBehavior;

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    /**
     * 工具
     */
    public void fight(){
        weaponBehavior.userWeapon();
    }


}
