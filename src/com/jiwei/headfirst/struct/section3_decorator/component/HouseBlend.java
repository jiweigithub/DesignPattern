package com.jiwei.headfirst.struct.section3_decorator.component;

import com.jiwei.headfirst.struct.section3_decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
