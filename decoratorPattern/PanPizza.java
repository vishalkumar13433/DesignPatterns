package com.example.designArchitectureEE.decoratorPattern;

public class PanPizza extends Pizza{
    @Override
    public double getCost() {
        return 300;
    }

    @Override
    public String getDescription() {
        return "this is a pan pizza";
    }
}
