package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlyWithWings;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.Quack;

/**
 * 绿头鸭
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flayBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.print("绿头鸭~");
    }
}
