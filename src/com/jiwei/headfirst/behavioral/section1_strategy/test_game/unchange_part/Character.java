package com.jiwei.headfirst.behavioral.section1_strategy.test_game.unchange_part;

import com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part.WeaponBehavior;

/**
 * 角色抽象类
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public abstract void fight();
}
