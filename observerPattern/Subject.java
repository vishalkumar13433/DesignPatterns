package com.example.designArchitectureEE.observerPattern;


public  interface Subject {
    void subsribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifySubscribers();
}
