package com.example.designArchitectureEE.decoratorPattern.decorator;

import com.example.designArchitectureEE.decoratorPattern.Pizza;

public class CheeseTopping extends ToppingDecorator {
    Pizza delegatedPizza;

    public CheeseTopping(Pizza pizza){
        delegatedPizza = pizza;
    }


    @Override
    public double getCost() {
        return delegatedPizza.getCost() + 100;
    }

    @Override
    public String getDescription() {
        return delegatedPizza.getDescription() + " added cheese ";
    }
}
