package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

public class RubberDuck extends Duck{

    public RubberDuck(){
        this.flyBehaviour = new NoFly();
        this.soundBehaviour= new SqueakSound();
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck");
    }
}
