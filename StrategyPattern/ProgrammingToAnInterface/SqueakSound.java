package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

public class SqueakSound implements SoundBehaviour{
    @Override
    public void makeSound() {
        System.out.println("Squeak Squeak Squeak!!!");
    }
}
