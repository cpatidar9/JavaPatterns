package com.cor;

public class Currency1000Dispenser implements CurrencyDispenser {

    CurrencyDispenser currencyDispenser;

    @Override
    public void dispense(int amount) {
        if (amount > 0) {
            int noOf1000s = amount / 1000;
            int balance = amount % 1000;

            if (noOf1000s > 0) {
                System.out.println("Dispensing " + noOf1000s + " 1000 denomination notes for " + amount + " ; BALANCE: "
                        + balance);
            }
            currencyDispenser.dispense(balance);
        }
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.currencyDispenser = nextDispenser;
    }
}
