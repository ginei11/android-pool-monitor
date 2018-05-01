package com.ingidear.poolmonitor.model;

public class PayoutsPOJO {
    private String paymentId, price, timeStamp;

    public PayoutsPOJO(String paymentId, String price, String timeStamp) {
        this.paymentId = paymentId;
        this.price = price;
        this.timeStamp = timeStamp;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
