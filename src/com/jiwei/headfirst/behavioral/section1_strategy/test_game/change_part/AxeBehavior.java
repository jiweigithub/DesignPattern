package com.jiwei.headfirst.behavioral.section1_strategy.test_game.change_part;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.print("使用斧头进行攻击");
    }
}
