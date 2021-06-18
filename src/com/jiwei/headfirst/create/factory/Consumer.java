package com.jiwei.headfirst.create.factory;


import com.jiwei.headfirst.create.factory.entity.Car;
import com.jiwei.headfirst.create.factory.simple.SimpleCarFactory;

public class Consumer {
    public static void main(String[] args) {
        //简单工厂模式
        Car tesla = SimpleCarFactory.getCar("Tesla");
        Car benz = SimpleCarFactory.getCar("Benz");
        Car bmw = SimpleCarFactory.getCar("BMW");
        tesla.name();
        benz.name();
        bmw.name();
    }
}
