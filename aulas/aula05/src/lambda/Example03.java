package lambda;

import java.util.Arrays;
import java.util.List;

public class Example03 {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9);

//        num.forEach(n -> System.out.println(n)); // callback

        num.forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n + " Even");
            }else {
                System.out.println(n + " Odd");
            }
        });
    }

/*    public boolean even(int n){
        return n % 2 == 0;
    }

    n -> n % 2 == 0;
*/



}
