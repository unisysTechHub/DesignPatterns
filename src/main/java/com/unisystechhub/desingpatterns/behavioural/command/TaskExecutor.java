package com.unisystechhub.desingpatterns.behavioural.command;

import java.util.concurrent.ArrayBlockingQueue;

public class TaskExecutor {
    private final ArrayBlockingQueue<Command> queue = new ArrayBlockingQueue<>(10);


    public void addTask(Command task){
        queue.add(task);
    }

    public void execute() throws InterruptedException {
        while (!queue.isEmpty()) {
            queue.take().execute();
        }
    }
}
