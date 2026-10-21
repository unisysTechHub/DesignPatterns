package com.unisystechhub.desingpatterns.behavioural.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WeatherObserver implements  Observer{
    @Override
    public void next(int value) {
        log.info("value {}",value);
    }

    @Override
    public void error(Exception exception) {
        log.error(exception.getLocalizedMessage());
    }

    @Override
    public void complete() {
        log.info("Emission complete");
    }

}
