package com.unisystechhub.desingpatterns.structural.bridge;

public abstract class Shape {
    protected final Render render;

    protected Shape(Render render) { this.render = render; }

    public abstract String draw();
}
