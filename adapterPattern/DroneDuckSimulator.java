package com.example.designArchitectureEE.adapterPattern;

import com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface.SimulatorClass;

public class DroneDuckSimulator {

    public static void main(String[] args) {
        DroneDuckAdapter droneAdapter = new DroneDuckAdapter();
        droneAdapter.drone = new RobotDrone();
        SimulatorClass.testDuck(droneAdapter);
    }

}
