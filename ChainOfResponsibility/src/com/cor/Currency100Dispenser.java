package com.cor;

public class Currency100Dispenser implements CurrencyDispenser {

    CurrencyDispenser currencyDispenser;

    @Override
    public void dispense(int amount) {
        if (amount > 0) {
            int noOf100s = amount / 100;
            int balance = amount % 100;

            if (noOf100s > 0) {
                System.out.println(
                        "Dispensing " + noOf100s + " 100 denomination notes for " + amount + " ; BALANCE: " + balance);
            }
        }
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.currencyDispenser = nextDispenser;
    }
}
