package com.example.designArchitectureEE.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{

    private List<Observer> subscribers;
    private WeatherData data;

    public WeatherSubject(){
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subsribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (Observer observer : subscribers){
            observer.notifyChange(data);
        }
    }

    public void setData(WeatherData data){
        this.data = data;
        notifySubscribers();
    }

    public WeatherData getData() {
        return data;
    }
}
