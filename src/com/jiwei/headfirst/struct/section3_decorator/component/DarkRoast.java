package com.jiwei.headfirst.struct.section3_decorator.component;

import com.jiwei.headfirst.struct.section3_decorator.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 2.99;
    }
}
