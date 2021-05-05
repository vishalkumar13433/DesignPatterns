package com.example.designArchitectureEE.adapterPattern;

public class RobotDrone implements Drone{
    @Override
    public void beep() {
        System.out.println("Beeeeeeeep !!!!!!!!");
    }

    @Override
    public void spinRotors() {
        System.out.println("Rotors are spinningg !!");
    }

    @Override
    public void takeOff() {
        System.out.println("Drone taking offff !!");
    }
}
