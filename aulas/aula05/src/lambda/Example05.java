package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example05 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        Stream<Integer> stream = list.stream();
//        stream.forEach(n -> System.out.println(n)); // first way;

//        list.stream().forEach(n -> System.out.println(n)); // second way;

        List<Integer> changedList = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        long count = list.stream()
                .filter(n -> n % 2 == 0)
                .count();


//        list.stream().map(n -> n * 2);
        list.forEach(n -> System.out.print(n + " "));
        System.out.println("Quantity of even numbers: " + count);
//        List<Integer> changedList = list.stream().map(n -> n * 2).collect(Collectors.toList());
        changedList.forEach(n -> System.out.print(n + " "));

        list.forEach(System.out::print);
    }
}
