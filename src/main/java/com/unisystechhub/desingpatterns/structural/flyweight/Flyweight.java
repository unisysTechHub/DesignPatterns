package com.unisystechhub.desingpatterns.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Flyweight {
private static final Map<String, BulletType> BULLET_TYPES = new ConcurrentHashMap<>();

public static BulletType getBulletType(String texture, int speed, int size) {
    String key = texture + ':' + speed + ':' + size;
    return BULLET_TYPES.computeIfAbsent(key, ignored -> new BulletType(texture, speed, size));
}

public static int cachedTypeCount() {
    return BULLET_TYPES.size();
}


}
