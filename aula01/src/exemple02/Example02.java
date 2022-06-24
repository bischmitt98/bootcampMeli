package exemple02;

public class Example02 {
    public static void main(String[] args) {
        int numero = -5;

        if (numero > 0) {
            System.out.println("Número > 0");
        } else {
            if (numero < 0) {
                System.out.println("Número < 0");
            } else {
                System.out.println("Número = 0");
            }
        }
    }
}
