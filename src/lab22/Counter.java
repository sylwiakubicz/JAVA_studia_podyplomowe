package lab22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Ile liczb chcesz dodać do listy?");
        int n = scanner.nextInt();

        System.out.println("Podaj liczby:");
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        int result = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .reduce(0, Integer::sum);

        System.out.println("Suma przetworzonych liczb: " + result);
    }
}
