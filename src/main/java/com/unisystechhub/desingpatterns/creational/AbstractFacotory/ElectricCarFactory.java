package com.unisystechhub.desingpatterns.creational.AbstractFacotory;

import java.util.UUID;

public class ElectricCarFactory implements AbstractFactory {
    @Override
    public Car getCar(String brandName) {
        return Car.builder().bandName(brandName).type("Electric").serialNo(UUID.randomUUID()).build();
    }

}
