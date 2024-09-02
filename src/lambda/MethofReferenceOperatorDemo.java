package lambda;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethofReferenceOperatorDemo {
    public static void main(String[] args) {
//        Function<String, Integer> func = s -> Integer.parseInt(s);
//        int numer = func.apply("123");

        // możemy użyć operatora odnieseinia
        Function<String, Integer> func = Integer::parseInt;
        int numer = func.apply("123");




//        Consumer<String> printer = s -> System.out.println(s);
//        printer.accept("Hello");

        // również można z zastosowaniem operatora odniesienia do metody
        Consumer<String> printer = System.out::println;
        printer.accept("Hello");
    }
}
