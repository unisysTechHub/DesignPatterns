package com.unisystechhub.desingpatterns.behavioural.observer;

public class Executor {

    public void execute(){
        Observer weatherObserver = new WeatherObserver();
        Publisher publisher = new Publisher();
        publisher.addObserver(weatherObserver);
        publisher.publishValues();

    }
}
