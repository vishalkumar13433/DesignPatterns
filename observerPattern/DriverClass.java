package com.example.designArchitectureEE.observerPattern;

public class DriverClass {

    public static void main(String[] args) {
        Observer alertObserver = new AlertSystem();
        Observer uiObserver = new UserInterface();
        Observer loggerObserver = new Logger();
        WeatherSubject subject = new WeatherSubject();
        subject.subsribe(alertObserver);
        subject.subsribe(uiObserver);
        subject.setData(new WeatherData(10.1,36.4,96.1));
        subject.subsribe(loggerObserver);
        subject.getData().setTemperature(40.1);
        subject.notifySubscribers();
    }
}
