package com.unisystechhub.desingpatterns.structural.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BycycleAdater implements Vehicle {
 private final Bycycle bycycle;

    @Override
    public void accelerate() {
        bycycle.go();
    }
}
