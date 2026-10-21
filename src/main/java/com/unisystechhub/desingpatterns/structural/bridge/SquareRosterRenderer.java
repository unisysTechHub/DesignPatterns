package com.unisystechhub.desingpatterns.structural.bridge;

public class SquareRosterRenderer extends Shape {
    public SquareRosterRenderer(Render render) { super(render); }

    @Override
    public String draw() { return render.render(this); }
}
