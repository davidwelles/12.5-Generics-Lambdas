package lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Functional myFunctional = (x, y) -> {

            System.out.println("I am inside a multi parameter lambda");
             return x + y;
        };

        System.out.println(myFunctional.operation(5, 3));

        List<Integer> myIntegerList = Arrays.asList(3,4,1,89,72);

        myIntegerList.stream()
                .filter( e -> e > 5)
                .forEach(e -> System.out.println(e));

        myIntegerList.stream()
                .map( e -> e + 1)
                .forEach(System.out::println);


    }
}


