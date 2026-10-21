package com.unisystechhub.desingpatterns.structural.decorate;

import org.springframework.stereotype.Service;

@Service
public class PlainBeverage implements Bevarage{


    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String descripiotn() {
        return "Plain beverage";
    }
}
