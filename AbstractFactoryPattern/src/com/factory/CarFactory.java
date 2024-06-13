package com.factory;

import com.products.Engine;
import com.products.FordEngine;
import com.products.FordTransmission;
import com.products.MarutiEngine;
import com.products.MarutiTransmission;
import com.products.Transmission;

public abstract class CarFactory {

    public static CarFactory getCarFactory(String carType) {
        return switch (carType) {
            case "ford" -> new FordFactory();
            case "maruti" -> new MarutiFactory();
            default -> throw new IllegalArgumentException("Invalid car type");
        };
    }

    public abstract Engine createEngine();

    public abstract Transmission createTransmission();

    private static class FordFactory extends CarFactory {

        @Override
        public Engine createEngine() {
            return new FordEngine();
        }

        @Override
        public Transmission createTransmission() {
            return new FordTransmission();
        }
    }

    private static class MarutiFactory extends CarFactory {

        @Override
        public Engine createEngine() {
            return new MarutiEngine();
        }

        @Override
        public Transmission createTransmission() {
            return new MarutiTransmission();
        }
    }
}
