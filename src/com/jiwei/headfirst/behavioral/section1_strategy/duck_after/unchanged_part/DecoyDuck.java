package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlyNoWay;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.MuteQuack;

/**
 * 诱饵鸭 不会飞也不会叫
 */
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flayBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.print("诱饵鸭~");
    }
}
