package com.unisystechhub.desingpatterns.behavioural.vistor;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circle implements  Shape{
    private float radius;

    @Override
    public void accept(ShapeVisitor vistor) {
        vistor.visit(this);

    }
}
