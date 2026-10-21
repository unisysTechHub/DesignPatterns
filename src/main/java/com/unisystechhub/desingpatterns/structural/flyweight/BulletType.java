package com.unisystechhub.desingpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BulletType implements Bullet {
    private  final String texture;
    private final int speed;
    private final int size;

    @Override
    public void render(int x, int y, String direction) {
        // texture, speed and size are shared intrinsic state; position and direction are per bullet.
    }
}
