package com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("使用匕首进行攻击");
    }
}
