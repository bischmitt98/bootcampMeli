package oop03;

import oop03.models.Animal;
import oop03.models.Cat;
import oop03.models.Cow;
import oop03.models.Dog;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow();
        cow.emitSound();
        cow.eatGrass();
        System.out.println("-----------------------------");

        Cat cat = new Cat();
        cat.emitSound();
        cat.eatMeat();
        System.out.println("-----------------------------");

        Dog dog = new Dog();
        dog.emitSound();
        dog.eatMeat();
        System.out.println("-----------------------------");
    }

}
