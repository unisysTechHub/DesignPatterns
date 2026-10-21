package com.unisystechhub.desingpatterns.creational.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;


}
