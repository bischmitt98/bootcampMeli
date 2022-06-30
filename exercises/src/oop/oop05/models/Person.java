package oop.oop05.models;

public class Person {
    private int age;
    private String name, cpf, phone;

    public Person(int age, String name, String cpf, String phone) {
        this.age = age;
        this.name = name;
        this.cpf = cpf;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
