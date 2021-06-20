package com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlayBehavior;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.QuackBehavior;

public abstract class Duck {

    FlayBehavior flayBehavior;

    QuackBehavior quackBehavior;

    public void setFlayBehavior(FlayBehavior flayBehavior) {
        this.flayBehavior = flayBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flayBehavior.fly();
    }

    public void swim() {
        System.out.print("\t在水里游");
    }

    public abstract void display();
}
