package com.example.designArchitectureEE.singletonPattern;
/*
- Single Object in the JVM
- Global point of access
- avoid constructing heavy objects like connections/loggers

 Boiler Plate Implementation includes
- double check locking
- private constructors
- nested synchroniztion
 */

public class PoolManagerSingleton {

    private String name;
}
