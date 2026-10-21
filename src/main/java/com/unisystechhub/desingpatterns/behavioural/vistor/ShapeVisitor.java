package com.unisystechhub.desingpatterns.behavioural.vistor;

public interface ShapeVisitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
