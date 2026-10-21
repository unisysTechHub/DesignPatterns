package com.unisystechhub.desingpatterns.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BullterInstance {
    final private int speed;
    final private String direction;
    final private BulletType bulletType;


}
