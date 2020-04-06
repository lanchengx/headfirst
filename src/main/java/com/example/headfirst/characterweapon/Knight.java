package com.example.headfirst.characterweapon;

import com.example.headfirst.characterweapon.character.Character;
import com.example.headfirst.characterweapon.weaponbehavior.impl.BowAndArrowBehavior;
import com.example.headfirst.characterweapon.weaponbehavior.impl.KnifeBehavior;
import com.example.headfirst.characterweapon.weaponbehavior.impl.SwordBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:53
 * @Description:
 */
public class Knight extends Character {
    @Override
    public void fight() {
        super.setWeaponBehavior(new BowAndArrowBehavior());
        super.fight();
    }
}
