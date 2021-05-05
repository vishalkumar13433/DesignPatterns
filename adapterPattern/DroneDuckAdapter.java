package com.example.designArchitectureEE.adapterPattern;

import com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface.Duck;

public class DroneDuckAdapter extends Duck {

    Drone drone;

    @Override
    public void display() {
        System.out.println("This is drone !!");
    }

    public void makeSound(){
        drone.beep();
    }

    public void fly(){
        drone.takeOff();
        drone.spinRotors();
    }

}
