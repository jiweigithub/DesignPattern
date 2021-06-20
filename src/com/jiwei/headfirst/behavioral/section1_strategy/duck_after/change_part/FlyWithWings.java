package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part;

public class FlyWithWings implements FlayBehavior {
    @Override
    public void fly() {
        System.out.print("\t在天上飞");
    }
}
