package com.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    public double getCartValue() {
        double total = 0;
        for (Product product : cart) {
            total += product.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy strategy) {
        double amount = getCartValue();
        strategy.pay(amount);
    }
}
