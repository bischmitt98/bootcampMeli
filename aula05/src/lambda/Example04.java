package lambda;

public class Example04 {
    interface IString{
        String run(String str);
    }

    public static void print(String text, IString iString){
        String res = iString.run(text);
        System.out.println(res);
    }

    public static void main(String[] args) {
        IString change = s -> s + " complement";
        print("Hi", change);
    }
}
