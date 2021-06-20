package com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part.AxeBehavior;

public class King extends Character {

    public King() {
        weaponBehavior = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.print("国王\t");
        weaponBehavior.useWeapon();
        System.out.println();
    }
}
