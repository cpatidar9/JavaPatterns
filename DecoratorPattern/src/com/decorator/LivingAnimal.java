package com.decorator;

public class LivingAnimal implements Animal {

    @Override
    public void describe() {
        System.out.println("I am a living animal");
    }
}
