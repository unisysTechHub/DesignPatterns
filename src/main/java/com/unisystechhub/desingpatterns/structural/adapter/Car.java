package com.unisystechhub.desingpatterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Car implements Vehicle {
    @Override
    public void accelerate() {

          log.info("car is acccelaerte");
    }
}
