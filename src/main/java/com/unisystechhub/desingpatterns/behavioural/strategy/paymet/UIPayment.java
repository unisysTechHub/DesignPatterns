package com.unisystechhub.desingpatterns.behavioural.strategy.paymet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UIPayment implements Payment{
    @Override
    public void pay(double amount) {
        log.info("UPI payment process init");
    }
}
