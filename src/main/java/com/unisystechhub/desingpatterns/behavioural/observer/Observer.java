package com.unisystechhub.desingpatterns.behavioural.observer;

public interface Observer {
     void next(int value);
     void error( Exception exception);
     void complete();
}
