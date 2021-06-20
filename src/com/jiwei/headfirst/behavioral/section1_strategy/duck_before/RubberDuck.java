package com.jiwei.headfirst.behavioral.section1_strategy.duck_before;

/**
 * 橡皮鸭
 */
public class RubberDuck extends Duck {

    /**
     * 因为橡皮鸭不会嘎嘎叫，需要覆盖父类方法，改成吱吱叫
     */
    @Override
    void quack() {
        System.out.print("\t吱吱叫~~~");
    }

    @Override
    void fly() {
        //因为橡皮鸭不会飞，覆盖父类方法，什么都不做
    }

    @Override
    void display() {
        System.out.print("橡皮鸭");
    }
}
