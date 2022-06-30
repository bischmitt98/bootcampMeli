package wrapper;

public class Example01 {
    public static void main(String[] args) {
        int n = 10;

//      Integer integer = new Integer(10); //deprecated
        Integer integer = 10; // autoboxing: boxing conversion
        int value = integer.intValue();
        value = integer; // autoboxing: unboxing conversion;

        System.out.println(integer);
        System.out.println(value);

        int num = Integer.parseInt("123");
        System.out.println(num);

        Integer n1 = 200;
        Integer n2 = 200;

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
    }
}
