package example03;

import java.util.Scanner;

public class AppPerson {
    public static void main(String[] args){
        String name;
        int age;

        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o seu nome");
        name = teclado.nextLine();

       // Scanner teclado2 = new Scanner(System.in);
        System.out.println("idade");
        age = teclado.nextInt();


        Person p = new Student("Bianca", "History");
        System.out.println(p);


    }
}