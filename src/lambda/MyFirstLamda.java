package lambda;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MyFirstLamda {
    public static void main(String[] args) {
        Multiplier multiplier = x -> x * x;
        System.out.println(multiplier.perform(2));


        Introducer introducer = name -> System.out.println("Cześć! Mam na imię " + name + ".");
        introducer.run("Sylwia");

        // wykorzystanie gotowych interfejs'ów funkcyjnych
        UnaryOperator<Integer> uo = o -> o * o;
        System.out.println(uo.apply(3));

        Consumer<String> consumer = name -> System.out.println("Cześć! Mam na imię " + name + ".");
        consumer.accept("Sylwia");
    }
}


// interfejs funkcyjny
//adnotacja robi zabezpieczenie też, że jakbyśmy dopisali kolejną metodę to wyświetli się błąd
// bo coś co określilibyśmy interfejsem funkcyjnym już by  nim nie był
@FunctionalInterface
interface Multiplier {
    int perform(int x);
}

@FunctionalInterface
interface Introducer {
    void run(String name);
}

