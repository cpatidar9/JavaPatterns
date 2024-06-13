package com.decorator;

public class WingDecorator extends Decorator implements Animal {
    public WingDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have wings and I can fly");
    }
}
