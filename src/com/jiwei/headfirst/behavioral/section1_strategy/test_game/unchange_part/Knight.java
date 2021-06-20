package com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part.SwordBehavior;

public class Knight extends Character{

    public Knight() {
        weaponBehavior = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.print("骑士\t");
        weaponBehavior.useWeapon();
        System.out.println();
    }
}
