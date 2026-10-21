package com.unisystechhub.desingpatterns.creational.AbstractFacotory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Util {

    public void executor(){
         PetrolFactory petrolFactory = new PetrolFactory();
         ElectricCarFactory electricCarFactory = new ElectricCarFactory();

        Car toyota= petrolFactory.getCar("Toyota");
        Car ford = electricCarFactory.getCar("fold");

        log.info(toyota.toString());
        log.info(ford.toString());

    }
}
