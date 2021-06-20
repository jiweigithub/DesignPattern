package com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part.KnifeBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("皇后\t");
        weaponBehavior.useWeapon();
        System.out.println();
    }
}
