package com.unisystechhub.desingpatterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Bycycle {

    public void go(){
        log.info("bycyle going");
    }
}
