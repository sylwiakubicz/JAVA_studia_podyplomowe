package lab22;

import java.util.*;
import java.util.Map.Entry;
public class TransactionStream {
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("Food", 50.0));
        transactions.add(new Transaction("Food", 20.0));
        transactions.add(new Transaction("Entertainment", 100.0));
        transactions.add(new Transaction("Utilities", 70.0));
        transactions.add(new Transaction("Food", 30.0));
        transactions.add(new Transaction("Utilities", 30.0));
        transactions.add(new Transaction("Entertainment", 50.0));

        Map<String, Double> categorySums = new HashMap<>();
        for (Transaction transaction : transactions) {
            categorySums.put(transaction.getCategory(),
                    categorySums.getOrDefault(transaction.getCategory(), 0.0) + transaction.getValue());
        }

        List<Entry<String, Double>> sortedCategorySums = new ArrayList<>(categorySums.entrySet());
        sortedCategorySums.sort(Entry.comparingByValue(Comparator.reverseOrder()));

        System.out.println("Suma wartości transakcji dla każdej kategorii posortowana malejąco:");
        for (Entry<String, Double> entry : sortedCategorySums) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
