package com.jiwei.headfirst.create.factory.simple;

import com.jiwei.headfirst.create.factory.entity.Benz;
import com.jiwei.headfirst.create.factory.entity.Bmw;
import com.jiwei.headfirst.create.factory.entity.Car;
import com.jiwei.headfirst.create.factory.entity.Tesla;

/**
 * 简单工厂模式
 * 优点：
 * 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 * 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。
 * 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 * 缺点：
 * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 */
public class SimpleCarFactory {

    public static Car getCar(String name) {
        if ("BMW".equals(name)) {
            return new Bmw();
        }
        if ("Tesla".equals(name)) {
            return new Tesla();
        }
        if ("Benz".equals(name)) {
            return new Benz();
        }
        return null;
    }

}
