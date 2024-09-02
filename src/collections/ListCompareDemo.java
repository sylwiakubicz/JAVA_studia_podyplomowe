package collections;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListCompareDemo {
    public static final int MAX_VALUE = 1_000_000;
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>(); // total time 5290 milisekund
        // linkedlist jest bardzeij efektywana wtedy
        List<Integer> list = new LinkedList<>(); // total time 8 milisekund
        fill(list);

        System.out.println(list);

        long startTime = System.currentTimeMillis();
        insertInMiddle(list);
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime + " milisekund");
    }

    static void fill(List list) {
        for (int i = 1; i <= MAX_VALUE; i++) {
            list.add(i);
        }
    }

    static void insertInMiddle(List list) {
        int half = MAX_VALUE / 2;
        int part = MAX_VALUE / 10;

        // iterator ustawiamy na jakąś konkretną wartość i od niego on zacznie iterować
        ListIterator listIterator = list.listIterator(half);
        for (int i = 1; i <= part; i++) {
            listIterator.add(0);
        }
    }
}
