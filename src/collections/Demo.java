package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(8); // autoboxing - automatycznie iterały zostaną opakowane typem Int i wstawione do naszej tablicy
        numbers.add(80);
        numbers.add(800);
        numbers.add(800); // można przechowywać dublikaty

        System.out.println(numbers.size());
        System.out.println(numbers.get(0)); // wybieranie elementu o konkretnym indeksie
        numbers.remove(0); // usuwanie elementu o konkretnym indeksie
        // .remover() też usuwa element o danej wartości
        // problem pojawia się gdy nasza lista ma typ Integer bo .remove(2) traktuje 2 jak indeks
        // jeśli chchemy element o konkretnej wartości usunąć to musimy zrzutować na jego typ
        // .remove(value) usuwa tylko pierwszy element o takiej wartości w liście
        System.out.println((Integer) 800);
        System.out.println(numbers.get(0)); // Dynamicznie przesuną się pozostałe elementy i w miejscu o indeksie 0 będzie ten który miał indeks 1 itd

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Liczba: " + numbers.get(i));
        }

        System.out.println();

        // iterowanie jak po tablicy też działa
        for (Integer number: numbers) {
            System.out.println("Liczba: " + number);
        }

        System.out.println();

        // iterowanie poprzez iterator
        Iterator<Integer> iterator = numbers.iterator(); // metoda iterator() zwróci nam iterator danego typu
        while (iterator.hasNext()) { // np czy masz dla mnei jeszcze jakiś elemetn
            System.out.println("Liczba: " + iterator.next()); // jeśli jest to daj XD
        }

        System.out.println();

        ListIterator<Integer> listIterator = numbers.listIterator(); // specjalistyczny iterator
        // może to samo co iterator klasyczny
        while (listIterator.hasNext()) {
            System.out.println("Liczba: " + listIterator.next());
        }
        // ale moze też poruszać się w stronę przeciwną - cofać sie
        System.out.println("\n Się cofamy teraz");
        while (listIterator.hasPrevious()) {
            Integer index = listIterator.previousIndex();
            Integer value = listIterator.previous();
            System.out.println("Liczba: " + value + " ma indkes: " + index);
        }

        System.out.println();
        // Teoretycznie nie musimy dawać typu bo wszystko dziedziczy po java Object class ale
        // nie powinno się tak robić, bo póżńiej mogą się pojawić różne kopmlikacje i trzeba pamietac
        // który element miał jaki typ itd
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add(new Object());
        list.add("Ala");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println((int) list.get(0) + (String) list.get(2)); // dopiero po rzutowaniu wykona się poprawnie konkatenacja
        // moze to prowadzić do różnych problemów


    }
}
