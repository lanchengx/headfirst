package com.example.headfirst.characterweapon;

import com.example.headfirst.characterweapon.character.Character;
import com.example.headfirst.characterweapon.weaponbehavior.impl.KnifeBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:46
 * @Description:
 */
public class Queen extends Character {
    @Override
    public void fight() {
        super.setWeaponBehavior(new KnifeBehavior());
        super.fight();
    }
}
