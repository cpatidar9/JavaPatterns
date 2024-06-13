package com.cor;

public class Currency500Dispenser implements CurrencyDispenser {

    CurrencyDispenser currencyDispenser;

    @Override
    public void dispense(int amount) {
        if (amount > 0) {
            int noOf500s = amount / 500;
            int balance = amount % 500;

            if (noOf500s > 0) {
                System.out.println(
                        "Dispensing " + noOf500s + " 500 denomination notes for " + amount + " ; BALANCE: " + balance);
            }
            currencyDispenser.dispense(balance);
        }
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.currencyDispenser = nextDispenser;
    }
}
