package com.example.designArchitectureEE.StrategyPattern.ProgrammingToAnInterface;

import java.util.ArrayList;
import java.util.List;

public class SimulatorClass {

    //refer screenshot in classpath for class diagram

    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Duck mallardDuck = new MallardDuck();
        ducks.add(mallardDuck);
        Duck rubberDuck = new RubberDuck();
        ducks.add(rubberDuck);
        for(Duck duck: ducks){
            System.out.println("-------------");
            testDuck(duck);
            System.out.println("-------------");
        }
    }

    public static void testDuck(Duck duck){
        duck.fly();
        duck.makeSound();
        duck.display();
    }

}
