package com.strategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Amount paid in cash: " + amount);
    }
}
