package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

public class NoFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I cant fly !!");
    }
}
