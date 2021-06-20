package com.jiwei.headfirst.behavioral.section1_strategy.duck_before;

public class SimUDuck {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Duck duck1 = new RedHeadDuck();
        Duck duck2 = new RubberDuck();
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
        System.out.println();
        duck1.display();
        duck1.quack();
        duck1.swim();
        duck1.fly();
        System.out.println();
        duck2.display();
        duck2.quack();
        duck2.swim();
        duck2.fly();
        System.out.println();

        //加入诱饵鸭
        Duck duck3 = new DecoyDuck();
        duck3.display();
        duck3.quack();
        duck3.swim();
        duck3.fly();

        System.out.println();

    }
}
