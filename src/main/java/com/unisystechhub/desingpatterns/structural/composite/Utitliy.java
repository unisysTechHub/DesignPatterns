package com.unisystechhub.desingpatterns.structural.composite;

public class Utitliy {

    void size(){
        FileSystemComponent file1 = new FileComponent("Test.pdf",10);
        Folder folder = new Folder();
        Folder subfolder = new Folder();
        folder.addFile(file1);
        subfolder.addFile(new FileComponent("Test.xls",20));
        folder.addFile(new FileComponent("Test.text",10));
        folder.addFile(subfolder);
        folder.getSize();

    }
}
