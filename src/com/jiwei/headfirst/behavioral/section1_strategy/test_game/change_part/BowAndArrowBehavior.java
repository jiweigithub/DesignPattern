package com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("使用弓箭进行攻击");
    }
}
