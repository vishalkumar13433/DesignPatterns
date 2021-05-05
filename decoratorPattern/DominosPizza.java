package com.example.designArchitectureEE.decoratorPattern;

import com.example.designArchitectureEE.decoratorPattern.decorator.CheeseTopping;
import com.example.designArchitectureEE.decoratorPattern.decorator.OlivesTopping;

public class DominosPizza {

    public static void main(String[] args) {
        //give me a thin crust pizza with cheese and olives
        Pizza pizza = new ThinCrustPizza();
        pizza = new CheeseTopping(pizza);
        pizza = new OlivesTopping(pizza);
        System.out.println(pizza.getDescription());
        System.out.println("Please pay:" + pizza.getCost());
    }
}
