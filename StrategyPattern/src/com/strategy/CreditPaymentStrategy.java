package com.strategy;

public class CreditPaymentStrategy implements PaymentStrategy {

    private String userName;
    private String cardNumber;

    public CreditPaymentStrategy(String userName, String cardNumber) {
        this.userName = userName;
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid with credit card: " + amount);
    }
}
