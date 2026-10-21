package com.unisystechhub.desingpatterns.behavioural.TemplateMethod;

import java.util.Map;

public abstract class PaymentNetworkSession {
    /** The fixed payment workflow; subclasses provide only payment-specific details. */
    public final String execute() {
        Map<String, String> headers = getHeaders();
        return sendRequest(getUrl(), headers);
    }

    protected abstract Map<String, String> getHeaders();
    protected abstract String getUrl();

    protected String sendRequest(String url, Map<String, String> headers) {
        return "Sent payment request to " + url + " with " + headers.size() + " headers";
    }
}
