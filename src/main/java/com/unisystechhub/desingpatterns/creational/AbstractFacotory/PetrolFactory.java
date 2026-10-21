package com.unisystechhub.desingpatterns.creational.AbstractFacotory;

import java.util.UUID;

public class PetrolFactory implements AbstractFactory {
    @Override
    public Car getCar(String brandName) {
         return Car.builder().bandName(brandName).type("Petrol").serialNo(UUID.randomUUID()).build();
    }

}
