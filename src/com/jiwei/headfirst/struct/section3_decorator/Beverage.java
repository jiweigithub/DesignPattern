package com.jiwei.headfirst.struct.section3_decorator;

/**
 * 抽象饮料类
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
