package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part;

public class FlyRocketPowered implements FlayBehavior {
    @Override
    public void fly() {
        System.out.print("火箭动力飞行");
    }
}
