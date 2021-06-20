package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlyNoWay;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flayBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.print("模型鸭~");
    }
}
