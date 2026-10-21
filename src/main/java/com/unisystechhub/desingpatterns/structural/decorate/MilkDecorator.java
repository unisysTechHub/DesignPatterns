package com.unisystechhub.desingpatterns.structural.decorate;

public class MilkDecorator extends BeverageDecortator{
    public MilkDecorator(Bevarage bevarage) {
        super(bevarage);

    }

    @Override
    public int getCost() {
        return super.getCost() + 2;
    }

    @Override
    public String descripiotn() {
        return super.descripiotn() + ", milk";
    }
}
