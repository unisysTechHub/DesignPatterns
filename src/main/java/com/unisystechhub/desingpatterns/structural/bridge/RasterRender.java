package com.unisystechhub.desingpatterns.structural.bridge;

public class RasterRender implements Render {
    @Override
    public String render(Shape shape) { return "Drawing " + shape.getClass().getSimpleName() + " as pixels"; }
}
