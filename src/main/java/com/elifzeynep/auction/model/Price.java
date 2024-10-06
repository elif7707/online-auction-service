package com.elifzeynep.auction.model;

public class Price {
    // float -> Primitive Type
    private float value;
    // String -> Class
    private String currency;

    public Price(float value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
