package com.example.designArchitectureEE.singletonPattern;

public class PoolManager {

    private static PoolManager instance;

    private PoolManager(){

    }

    public static synchronized PoolManager getInstance(){
        if(instance == null){
            instance =  new PoolManager();
        }
        return instance;
    }
}
