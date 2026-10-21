package com.unisystechhub.desingpatterns;

import com.unisystechhub.desingpatterns.structural.adapter.Car;
import com.unisystechhub.desingpatterns.structural.adapter.Vehicle;
import com.unisystechhub.desingpatterns.creational.prototype.LoanApplication;
import com.unisystechhub.desingpatterns.creational.prototype.LoanType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class DesingpatternsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesingpatternsApplication.class, args);
        Vehicle vehecle = new Car();
       // Vehicle bycycle  =  new  BycycleAdater
        LoanApplication homeLoanAppcation = new LoanApplication(1, LoanType.CAR,new ArrayList<>());

        //for customer 1

        //customer 2
       LoanApplication customer2Applicaiotn =   homeLoanAppcation.clone();
                       customer2Applicaiotn.setDocumetns(new ArrayList<>());
    }

}
