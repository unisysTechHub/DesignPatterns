package com.unisystechhub.desingpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Publish {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void  publishValues() {
        publish(1);
    }

    public void publish(int value) {
        List.copyOf(observerList).forEach(observer -> observer.next(value));
    }

    public void complete() {
        List.copyOf(observerList).forEach(Observer::complete);

    }
    public void addObserver(Observer observer){
        observerList.add(observer);
    }
    public void removeObserver(Observer observer){
        observerList.remove(observer);
    }
}
