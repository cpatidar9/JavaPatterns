package com.cor;

public interface CurrencyDispenser {

    void dispense(int amount);

    void setNextDispenser(CurrencyDispenser nextDispenser);
}
