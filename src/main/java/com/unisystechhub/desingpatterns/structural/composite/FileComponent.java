package com.unisystechhub.desingpatterns.structural.composite;

public class FileComponent implements FileSystemComponent {
    int size =10;
    String name;
    public FileComponent(String name, int size){
        this.size = size;
        this.name = name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
