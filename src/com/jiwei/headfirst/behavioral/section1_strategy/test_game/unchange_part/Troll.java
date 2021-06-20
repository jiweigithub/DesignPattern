package com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part.BowAndArrowBehavior;

public class Troll extends Character {

    public Troll() {
        weaponBehavior = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.print("游侠\t");
        weaponBehavior.useWeapon();
        System.out.println();
    }
}
