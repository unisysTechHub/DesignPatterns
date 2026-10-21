package com.unisystechhub.desingpatterns.behavioural.vistor;

import java.util.ArrayList;
import java.util.List;

public class ShapeDrawer implements ShapeVisitor {
    private final List<String> drawnShapes = new ArrayList<>();

    @Override
    public void visit(Circle circle) { drawnShapes.add("circle:" + circle.getRadius()); }

    @Override
    public void visit(Rectangle rectangle) {
        drawnShapes.add("rectangle:" + rectangle.getWidth() + "x" + rectangle.getHeight());
    }

    public List<String> getDrawnShapes() { return List.copyOf(drawnShapes); }
}
