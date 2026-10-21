package com.unisystechhub.desingpatterns.behavioural.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Task implements  Command{
    private final String name;
    public Task(String name){
        this.name =name;
    }
    private void taskFunctionality(){
        log.info("performing task functionality{}",name);
    }
    @Override
    public void execute() {
        taskFunctionality();

    }
}
