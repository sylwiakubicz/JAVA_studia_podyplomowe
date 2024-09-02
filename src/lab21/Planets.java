package lab21;

import java.util.Arrays;
import java.util.Comparator;

public class Planets {
    public static void main(String[] args) {
        String[] planets = {"Słońce", "Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};

        Arrays.sort(planets, (o1, o2) -> o1.charAt(o1.length() - 1) - o2.charAt(o2.length() - 1));
        System.out.println(Arrays.toString(planets));
    }
}
