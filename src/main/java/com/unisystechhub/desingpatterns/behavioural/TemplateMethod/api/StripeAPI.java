package com.unisystechhub.desingpatterns.behavioural.TemplateMethod.api;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;


public  class StripeAPI extends APITemplate<StripepaymentMethods> {

    public StripeAPI(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    protected String getApiUrl() {
        return "https://api.stripe.com/v1/customers/cus_NphM1uPuSykVrw/payment_methods";
    }

    @Override
    protected HttpMethod getHttpMethod() {
        return HttpMethod.GET;
    }

    @Override
    protected HttpHeaders getHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", gettoken());
        headers.set("Content-Type", "application/x-www-form-urlencoded");
        return headers;
    }


    @Override
    protected MultiValueMap<String, String> getRequestBody() {
        // Create form parameters for POST or PUT if required
        MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
        body.add("type", "card");
        return body;
    }

    @Override
    protected Class<StripepaymentMethods> getResponseType() {
        return StripepaymentMethods.class;
    }

    @Override
    protected void processResponse(StripepaymentMethods response) {
        System.out.println("Mapped User API Response: " + response.getUrl());
    }

    static class ReqiestBody{
        String type = "card";
    }
    String gettoken() {
        String token = "Bearer sk_test_51N3t4MSD6ObpZiisd6JT08wp67spgV2Edv9ZG1AOrfXVYIUOT45GWSaOw3FW8pG4js4FWWQiF42LSA4J5j6NCNCe0048nEYyoH";
        return token;
    }
}