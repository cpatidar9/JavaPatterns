package com.decorator;

public class LegDecorator extends Decorator {

    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have legs and I can walk");
    }
}
