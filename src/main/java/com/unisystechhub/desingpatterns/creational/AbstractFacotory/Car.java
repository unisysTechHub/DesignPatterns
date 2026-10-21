package com.unisystechhub.desingpatterns.creational.AbstractFacotory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Car {
   String bandName;
   String type;
   UUID serialNo;
}
