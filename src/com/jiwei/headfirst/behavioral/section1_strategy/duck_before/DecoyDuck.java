package com.jiwei.headfirst.behavioral.section1_strategy.duck_before;

/**
 * 诱饵鸭 不会飞也不会叫
 */
public class DecoyDuck extends Duck {

    @Override
    void quack() {
        //什么都不做
    }

    @Override
    void fly() {
        //什么都不做
    }

    @Override
    void display() {
        System.out.print("诱饵鸭");
    }
}
