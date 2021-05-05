package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

/*
* Always Encapsulate the part that varies..
* Here , the fly and swim behaviour changes for different types of ducks
* Hence , Try to encapsulate those behaviour
* */

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    SoundBehaviour soundBehaviour;

    public abstract void display();

    public void makeSound(){
        soundBehaviour.makeSound();
    }

    public void fly(){
        flyBehaviour.fly();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    }
}
