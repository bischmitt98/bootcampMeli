package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        Example01<Integer> obj1 = new Example01(13);
        Example01<String> obj2 = new Example01("Oiii");

        System.out.println(obj1.getObj());
        System.out.println(obj2.getObj());

        List<?> list = new ArrayList();
        HashMap<Integer, String> map = new HashMap<>();
    }
}
