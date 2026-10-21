package com.unisystechhub.desingpatterns.creational.singleton;

public class Singleton {
    private Singleton(){}

    public static final Singleton INSTANCE = new Singleton();
} ;
