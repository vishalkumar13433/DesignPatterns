package com.example.designArchitectureEE.observerPattern;

public class WeatherData {
    private Double pressure;
    private Double temperature;
    private Double windSpeed;

    public WeatherData(){

    }

    public WeatherData(Double pressure, Double temperature, Double windSpeed) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
    }

    public Double getPressure() {
        return pressure;
    }

    public void setPressure(Double pressure) {
        this.pressure = pressure;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "pressure=" + pressure +
                ", temperature=" + temperature +
                ", windSpeed=" + windSpeed +
                '}';
    }
}
