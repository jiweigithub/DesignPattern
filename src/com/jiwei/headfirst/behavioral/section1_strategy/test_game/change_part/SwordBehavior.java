package com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("使用宝剑进行攻击");
    }
}
