package com.example.headfirst.characterweapon;

import com.example.headfirst.characterweapon.weaponbehavior.impl.SwordBehavior;

/**
 * @ProjectName headfirst
 * @Author: lancx
 * @Date: 2020/4/6 21:39
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("======king=====");
        King king = new King();
        king.setWeaponBehavior(new SwordBehavior());
        king.fight();
        System.out.println("======queen=====");
        Queen queen = new Queen();
        queen.fight();
        System.out.println("======knight=====");
        Knight knight = new Knight();
        knight.fight();
    }
}
