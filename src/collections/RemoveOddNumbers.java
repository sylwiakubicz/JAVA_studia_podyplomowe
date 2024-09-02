package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println(numbers);

// Tak się nie robi:
//        for (Integer i : numbers) {
//            if (i % 2 != 0) {
//                numbers.remove(i);
//            }
//        }

// nie można jednocześńie iterować po kolejcji i jej zmieniać
//        for (int k = 0; k <numbers.size(); k++) {
//            Integer i = numbers.get(k);
//            if (i % 2 != 0) {
//                numbers.remove(i);
//            }
//        }

        // poprawny sposób, bo iterator wie że my usuwamy
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if (i % 2 != 0) {
                iterator.remove();
            }
        }

        System.out.println(numbers);
    }
}
