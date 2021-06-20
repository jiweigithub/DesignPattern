package com.jiwei.headfirst.behavioral.section1_strategy.duck_after;

import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.change_part.FlyRocketPowered;
import com.jiwei.headfirst.behavioral.section1_strategy.duck_after.unchanged_part.*;

public class SimUDuck {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Duck duck1 = new RedHeadDuck();
        Duck duck2 = new RubberDuck();
        duck.display();
        duck.performQuack();
        duck.swim();
        duck.performFly();
        System.out.println();
        duck1.display();
        duck1.performQuack();
        duck1.swim();
        duck1.performFly();
        System.out.println();
        duck2.display();
        duck2.performQuack();
        duck2.swim();
        duck2.performFly();
        System.out.println();

        //加入诱饵鸭
        Duck duck3 = new DecoyDuck();
        duck3.display();
        duck3.performQuack();
        duck3.swim();
        duck3.performFly();

        System.out.println();

        //加入模型鸭
        Duck duck4 = new ModelDuck();
        duck4.display();
        duck4.performQuack();
        duck4.swim();
        duck4.performFly();
        System.out.println("\t为模型鸭装上火箭动力~");
        duck4.setFlayBehavior(new FlyRocketPowered());
        duck4.performFly();
        System.out.println();

    }
}
