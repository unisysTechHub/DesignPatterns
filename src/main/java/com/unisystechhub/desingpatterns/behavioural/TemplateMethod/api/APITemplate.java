package com.unisystechhub.desingpatterns.behavioural.TemplateMethod.api;

import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import tools.jackson.databind.ObjectMapper;


public abstract class APITemplate<T> { // Use generics for flexibility in response types

    private final RestTemplate restTemplate;

    public APITemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Template method
    public T callApi() {
        String url = getApiUrl();
        HttpHeaders headers = getHeaders();
        Object requestBody = getRequestBody();

        HttpEntity<Object> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, getHttpMethod(), requestEntity, String.class);

        // Map response to a specific model
        T mappedResponse = mapResponse(response.getBody());

        // Process the mapped response
        processResponse(mappedResponse);

        return mappedResponse;
    }

    // Abstract methods for customization
    protected abstract String getApiUrl();

    protected abstract HttpMethod getHttpMethod();

    protected abstract HttpHeaders getHeaders();

    protected abstract Object getRequestBody();

    protected abstract Class<T> getResponseType(); // New method for specifying response type

    protected abstract void processResponse(T response);

    // Map JSON response to the specified type
    protected T mapResponse(String responseBody) {
        try {
            return new ObjectMapper().readValue(responseBody, getResponseType());
        } catch (Exception e) {
            throw new RuntimeException("Failed to map response", e);
        }
    }
}