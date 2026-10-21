package com.unisystechhub.desingpatterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.ArrayList;

@Data
@AllArgsConstructor
public class LoanApplication implements Cloneable {
    int tenure;
    LoanType laonType;
    List<String> documetns;

    @Override
    public LoanApplication clone() {
        try {
            LoanApplication copy = (LoanApplication) super.clone();
            copy.documetns = new ArrayList<>(documetns);
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
