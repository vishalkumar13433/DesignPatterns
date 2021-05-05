package com.example.designArchitectureEE.decoratorPattern.decorator;

import com.example.designArchitectureEE.decoratorPattern.Pizza;

public class PepperTopping extends ToppingDecorator{

    Pizza pizza;

    public PepperTopping(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 5;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ",added pepper";
    }
}
