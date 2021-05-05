package com.example.designArchitectureEE.observerPattern;

public class AlertSystem extends Observer{
    @Override
    public void notifyChange(WeatherData data) {
        alert(data);
    }

    private void alert(WeatherData data){
        System.out.println("Alerting about data change" + data);
    }
}
