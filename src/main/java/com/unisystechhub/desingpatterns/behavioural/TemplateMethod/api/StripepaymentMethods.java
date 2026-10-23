package com.unisystechhub.desingpatterns.behavioural.TemplateMethod.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class StripepaymentMethods {
    private String object;
    private List<PaymentMethod> data;
    @JsonProperty("has_more")
    private boolean hasMore;
    private String url;
   @Data
   @AllArgsConstructor
    public static class PaymentMethod {
       private String id;
       private String object;
       @JsonProperty("allow_redisplay")
       private String allowRedisplay;
       @JsonProperty("billing_details")
       private BillingDetails billingDetails;
       private Card card;
       private long created;
       private String customer;
       private boolean livemode;
       private Metadata metadata;
       private String type;
   }
   @Data
   @AllArgsConstructor
    public static class BillingDetails {
       private Address address;
       private String email;
       private String name;
       private String phone;
   }
   @Data
   @AllArgsConstructor
    public static class Address {
       private String city;
       private String country;
       private String line1;
       private String line2;
       @JsonProperty("postal_code")
       private String postalCode;
       private String state;
   }
   @Data
   @AllArgsConstructor
    public static class Card {
       private String brand;
       private Checks checks;
       private String country;
       @JsonProperty("display_brand")
       private String displayBrand;
       @JsonProperty("exp_month")
       private int expMonth;
       @JsonProperty("exp_year")
       private int expYear;
       private String fingerprint;
   }
   @Data
   @AllArgsConstructor
    public static class Checks {
        @JsonProperty("address_line1_check")
        private String addressLine1Check;
        @JsonProperty("address_postal_code_check")
        private String addressPostalCodeCheck;
        @JsonProperty("cvc_check")
        private String cvcCheck;
    }
    @Data
    @AllArgsConstructor
    public static class Networks {
        private List<String> available;
        private String preferred;
    }
    @Data
    @AllArgsConstructor
    public static class ThreeDSecureUsage {
        private boolean supported;
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Metadata {
        // Assuming it's an empty object; otherwise, add fields here
    }
}
