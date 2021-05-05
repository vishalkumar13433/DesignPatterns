package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

public class QuackSound implements SoundBehaviour{
    @Override
    public void makeSound() {
        System.out.println("Quack Quack Quack !!");
    }
}
