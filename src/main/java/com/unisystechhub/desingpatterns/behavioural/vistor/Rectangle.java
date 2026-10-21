package com.unisystechhub.desingpatterns.behavioural.vistor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Rectangle implements Shape {
    private float width;
    private float height;

    @Override
    public void accept(ShapeVisitor visitor) { visitor.visit(this); }
}
