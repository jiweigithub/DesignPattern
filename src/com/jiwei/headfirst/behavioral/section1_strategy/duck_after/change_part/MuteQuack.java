package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.print("\t安静~");
    }
}
