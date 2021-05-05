package com.example.designArchitectureEE.decoratorPattern;

public class ThinCrustPizza extends Pizza{
    @Override
    public double getCost() {
        return 450;
    }

    @Override
    public String getDescription() {
        return "This is a thin crust pizza";
    }
}
