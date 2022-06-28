package jungleRun;

public class Main {
    public static void main(String[] args) {
        Participant bi = new Participant(01L, "Bianca", "Klein Schmitt", "48999999", "48999999", "A+", "small", 24, 123123);
        Participant dudu = new Participant(02L, "Eduardo", "Eller Behr", "48999999", "48999999", "AB+", "medium", 16, 123123);

        System.out.println("-----------");
        System.out.println(bi);
        System.out.println(bi.calculatePrice(bi));
        System.out.println("-----------");
        System.out.println(dudu);
    }
}
