package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Utworórz liczbę 100 elementów (Liczb całkowitych) od 1 do 100
// wyśiwetl listę
// usuń co 3 element
// wyświetl listę
public class Task {
    public static void main(String[] args) {

        // warto nadać na start jakąś wartośc do tej listy, zwiększa to efektywność
        // i nie nadużywamy tego dynamicznego rozszerzania
        // mimo to size dalej będzie 0 bo jeszcze nic tam nie wstawiliśmy ale lista będzie już przygotwana ze tyle ich dostanie kiedyś tam
        List<Integer> list = new ArrayList<>(120);
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        System.out.println(list);

//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer i = iterator.next();
//            if (i % 3 == 0) {
//                iterator.remove();
//            }
//        }

        // można tez tak krótko
        list.removeIf(number -> number % 3 == 0);


        System.out.println(list);
    }
}
