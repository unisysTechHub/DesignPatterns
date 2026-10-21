package com.unisystechhub.desingpatterns.structural.decorate;


public abstract class BeverageDecortator implements  Bevarage{
    protected   Bevarage bevarage;
    // Beverage isntance - Plain Bevarage
    protected BeverageDecortator(Bevarage bevarage){
        this.bevarage =bevarage;
    }
    @Override
    public int getCost() {
        return bevarage.getCost();
    }

    @Override
    public String descripiotn() {
        return bevarage.descripiotn();
    }
}
