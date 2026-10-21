package com.unisystechhub.desingpatterns.behavioural.TemplateMethod;

import java.util.HashMap;
import java.util.Map;

public enum PaymentAPI {
    CARD, UPI, NET_BANKING;

    public String url(String[] pathParams) {
        return switch (this) {
            case CARD -> "https://payments.example/card";
            case UPI -> "https://payments.example/upi";
            case NET_BANKING -> "https://payments.example/net-banking";
        };
    }

    public Map<String, String> headers() {
        Map<String, String> headers = new HashMap<>();
        headers.put("X-Payment-Method", name());
        return headers;
    }
}
