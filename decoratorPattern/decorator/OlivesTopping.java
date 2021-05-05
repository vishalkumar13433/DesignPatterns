package com.example.designArchitectureEE.decoratorPattern.decorator;

import com.example.designArchitectureEE.decoratorPattern.Pizza;

public class OlivesTopping extends ToppingDecorator{

    Pizza pizza;

    public OlivesTopping(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ",added olives";
    }
}
