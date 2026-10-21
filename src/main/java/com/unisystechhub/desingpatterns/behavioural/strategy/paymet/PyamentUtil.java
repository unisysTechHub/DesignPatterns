package com.unisystechhub.desingpatterns.behavioural.strategy.paymet;

public class PyamentUtil {

    void payment(){

        OnlinePayment cardPayment = new OnlinePayment(new CardPayment());
        OnlinePayment upiPyament = new OnlinePayment(new UIPayment());

        cardPayment.pay(220);
        upiPyament.pay(100);
    }
}
