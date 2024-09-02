package lambda;

import java.util.Arrays;
import java.util.Comparator;

public class PlanetsLambda {

    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun" };

        // 1 wersja
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };

        // 2 wersja
//        Comparator<String> comparator = (o1, o2) -> o1.length() - o2.length();
//        Arrays.sort(planets, comparator);

        //3 wersja
//        Arrays.sort(planets, (o1, o2) -> o1.length() - o2.length());

        // 4 wersja
        // :: to operator odniesienia do metody
        Arrays.sort(planets, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(planets));
    }
}
