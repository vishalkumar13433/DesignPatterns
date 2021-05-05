package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

public class MallardDuck extends Duck{

    public MallardDuck(){
        this.flyBehaviour = new FlyWithWings();
        this.soundBehaviour = new QuackSound();
    }
    @Override
    public void display() {
        System.out.println("I am a mallard Duck");
    }
}
