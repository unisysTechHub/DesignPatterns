package com.unisystechhub.desingpatterns.behavioural.strategy.paymet;

public class OnlinePayment {
    private Payment payment;
    public OnlinePayment(Payment payment){
        this.payment=payment;
    }

    public void pay(double amount){
        payment.pay(amount);
    }

    public void setPayment(Payment payment) { this.payment = payment; }
}
