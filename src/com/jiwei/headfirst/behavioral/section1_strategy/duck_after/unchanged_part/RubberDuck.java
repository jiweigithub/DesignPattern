package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlyNoWay;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.Squeak;

/**
 * 橡皮鸭 不会飞
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flayBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.print("橡皮鸭~");
    }
}
