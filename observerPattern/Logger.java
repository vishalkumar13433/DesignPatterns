package com.example.designArchitectureEE.observerPattern;

public class Logger extends Observer{
    @Override
    public void notifyChange(WeatherData data) {
        logData(data);
    }

    private void logData(WeatherData data){
        System.out.println("Logging change in Data" + data);
    }
}
