package com.example.designArchitectureEE.observerPattern;

public class UserInterface extends Observer{
    @Override
    public void notifyChange(WeatherData data) {
        showinUI(data);
    }

    private void showinUI(WeatherData data){
        System.out.println("Showing in UI : " + data);
    }
}
