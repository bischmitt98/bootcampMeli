package oop;

    public class Main {
        public static void main(String[] args) {
            Person p1 = new Person();
            Person p2 = new Person("Eduardo", "2", 27);
            Person p3 = new Person("Bianca", "1", 24, 82.2, 1.72  );

            p1.setName("Maria");
            p1.setAge(53);
            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3 + " BMI: " + p3.BMI(p3) + ", is of Age: " + p3.isOfAge(p3));
        }
    }
