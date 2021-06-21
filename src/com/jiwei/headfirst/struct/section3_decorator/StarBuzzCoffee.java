package com.jiwei.headfirst.struct.section3_decorator;

import com.jiwei.headfirst.struct.section3_decorator.component.DarkRoast;
import com.jiwei.headfirst.struct.section3_decorator.component.Espresso;
import com.jiwei.headfirst.struct.section3_decorator.component.HouseBlend;
import com.jiwei.headfirst.struct.section3_decorator.decorator.Mocha;
import com.jiwei.headfirst.struct.section3_decorator.decorator.Soy;
import com.jiwei.headfirst.struct.section3_decorator.decorator.Whip;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.print(beverage.getDescription() + " $ " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $ " + beverage3.cost());
    }
}
