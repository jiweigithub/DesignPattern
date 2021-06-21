package com.jiwei.headfirst.struct.section3_decorator.component;

import com.jiwei.headfirst.struct.section3_decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.66;
    }
}
