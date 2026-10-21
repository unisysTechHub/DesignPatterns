package com.unisystechhub.desingpatterns.structural.bridge;

public class VectorRender implements Render {
    @Override
    public String render(Shape shape) { return "Drawing " + shape.getClass().getSimpleName() + " as vectors"; }
}
