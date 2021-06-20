package com.jiwei.headfirst.behavioral.section1_strategy.duck_before;

public abstract class Duck {

    void quack() {
        System.out.print("\t嘎嘎嘎~~~");
    }

    void swim() {
        System.out.print("\t在水里游");
    }

    void fly() {
        System.out.print("\t在天上飞");
    }

    /**
     * 展示外观
     */
    abstract void display();
}
