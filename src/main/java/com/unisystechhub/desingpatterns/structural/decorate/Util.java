package com.unisystechhub.desingpatterns.structural.decorate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Util {

    void addDecorator(){
        PlainBeverage plainBeverage = new PlainBeverage();
        MilkDecorator milk= new MilkDecorator(plainBeverage);

        log.info(milk.getCost()+"");
    }
}
