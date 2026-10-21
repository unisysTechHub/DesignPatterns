package com.unisystechhub.desingpatterns.creational.AbstractFacotory;

public class FacotryProducer {
    public static AbstractFactory getFactory(FactoryType factoryType){
        if (factoryType == null) throw new IllegalArgumentException("factoryType is required");
        return switch (factoryType) {
            case Electric -> new ElectricCarFactory();
            case Petro -> new PetrolFactory();
        };
    }
}
