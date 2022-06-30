package oop.oop03.models;

import oop.oop03.interfaces.ICarnivores;

public class Dog extends Animal implements ICarnivores {

    @Override
    public void emitSound() {
        System.out.println("Au au!");
    }

    @Override
    public void eatMeat() {
        System.out.println("The dog is eating meat!");
    }
}
