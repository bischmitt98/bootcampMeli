package oop03.models;

import oop03.interfaces.IHerbivores;

public class Cow extends Animal implements IHerbivores {

    @Override
    public void emitSound() {
        System.out.println("Muuuuu!");
    }

    @Override
    public void eatGrass() {
        System.out.println("The cow is eating grass!");
    }
}
