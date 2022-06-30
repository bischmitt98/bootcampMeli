package oop.oop03.models;

import oop.oop03.interfaces.ICarnivores;

public class Cat extends Animal implements ICarnivores {

    @Override
    public void emitSound() {
        System.out.println("Miauuu!");
    }

    @Override
    public void eatMeat() {
        System.out.println("The cow is eating meat!");
    }
}
