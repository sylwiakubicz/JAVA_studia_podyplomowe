package collections.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Adde", "IKEA", 2016);
        Chair chair2 = new Chair("Janige", "IKEA", 2016);
        Chair chair3 = new Chair("Adde", "IKEA", 2015);
        Chair chair4 = new Chair("Adde", "IKEA", 2016);

        Set<Chair> ferniture = new HashSet<>();
        ferniture.add(chair1);
        ferniture.add(chair2);
        ferniture.add(chair3);
        ferniture.add(chair4);

        System.out.println(ferniture);
    }
}
