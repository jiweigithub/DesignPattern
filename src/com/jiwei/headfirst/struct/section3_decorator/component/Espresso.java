package com.jiwei.headfirst.struct.section3_decorator.component;

import com.jiwei.headfirst.struct.section3_decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
