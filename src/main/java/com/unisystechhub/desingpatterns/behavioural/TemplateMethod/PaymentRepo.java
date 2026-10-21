package com.unisystechhub.desingpatterns.behavioural.TemplateMethod;

import java.util.Map;

public class PaymentRepo extends PaymentNetworkSession {
    private PaymentAPI current;

    public String upiPayment() { current = PaymentAPI.UPI; return execute(); }
    public String cardPayment() { current = PaymentAPI.CARD; return execute(); }
    public String netBankingPayment() { current = PaymentAPI.NET_BANKING; return execute(); }

    @Override protected Map<String, String> getHeaders() { return current.headers(); }
    @Override protected String getUrl() { return current.url(new String[0]); }
}
