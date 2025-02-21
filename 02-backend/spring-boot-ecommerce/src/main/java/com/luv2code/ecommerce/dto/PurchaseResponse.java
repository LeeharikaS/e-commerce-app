package com.luv2code.ecommerce.dto;

public class PurchaseResponse {
    private final String orderTrackingNumber;

    // No-args constructor
    public PurchaseResponse() {
        this.orderTrackingNumber = null;
    }

    // Constructor with argument
    public PurchaseResponse(String orderTrackingNumber) {
        this.orderTrackingNumber = orderTrackingNumber;
    }

    public String getOrderTrackingNumber() {
        return orderTrackingNumber;
    }
}
