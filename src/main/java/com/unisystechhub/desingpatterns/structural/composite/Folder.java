package com.unisystechhub.desingpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent {
    private final List<FileSystemComponent> files = new ArrayList<>();


    @Override
    public int getSize() {

        return files.stream().mapToInt(FileSystemComponent::getSize).sum();

    }
    public void addFile(FileSystemComponent fileSystemComponent){
        files.add(fileSystemComponent);
    }
}
