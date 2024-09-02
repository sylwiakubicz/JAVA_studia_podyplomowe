package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(120);
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);

        // zamiana elementu w miejscu o konkretnym indeksie
        int index = list.lastIndexOf(6);
        list.set(index, 99);
        System.out.println(list);


    }
}
