package com.unisystechhub.desingpatterns.behavioural.strategy.paymet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        log.info("Card process starts");
    }
}
