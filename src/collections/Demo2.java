package collections;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(120);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        // kopiowanie wszytskich elementów z listy do tablicy
        Integer[] array = new Integer[list.size()]; // domyślnie wypełniona nullami bo to tablica obiektów
        array = list.toArray(array);

        for (Integer number: array) {
            System.out.println(number);
        }
            // w formie skróconej
            System.out.println();
            Integer[] array2 = list.toArray(new Integer[list.size()]);
            for (Integer number: array) {
                System.out.println(number);
            }

        // hurtowe dodanie do listy
        System.out.println();
        List<Integer> allNumbers = new ArrayList<>();
        allNumbers.addAll(list);
        allNumbers.addAll(list);
        allNumbers.addAll(list);
        System.out.println(allNumbers);


    }

}
