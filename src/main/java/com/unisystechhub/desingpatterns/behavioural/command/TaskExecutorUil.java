package com.unisystechhub.desingpatterns.behavioural.command;

public class TaskExecutorUil {

    public void execute() throws InterruptedException {
     Task task1 =   new Task("Task1");
        Task task2 =   new Task("Task1");

        TaskExecutor taskExecutor= new TaskExecutor();
        taskExecutor.addTask(task1);
        taskExecutor.addTask(task2);
        taskExecutor.execute();

    }
}
