package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo4 {
    public static void main(String[] args) {

        // rodzaj kolekcji mapującej kluczy na konkretne wartości, klucze muszą być unikatowe
        Map<String, String> phones = new HashMap<>();
        phones.put("Tomek", "567-234-367");
        phones.put("Alicja", "234-765-987");
        phones.put("Tomek", "999-999-999");
        phones.put("Barbara", "999-999-999");

        System.out.println(phones);

        Set<String> keys = phones.keySet();
        System.out.println(keys);

        System.out.println(phones.containsKey("Barbara"));

        System.out.println(phones.get("Barbara"));
        System.out.println(phones.get("Karol"));

        // iterowanie po kluczach, po kluczach mozemy się dostać do wartości
        for (String key : phones.keySet()) {
            System.out.println(key + " -> " + phones.get(key));
        }

        System.out.println();

        //iterowanie po wartościach, od wartości nie możemy przejść do klucza boo wartośći mogą się dublować
        for (String value : phones.values()) {
            System.out.println(value);
        }

        // za pomocą entry dostajemy się jednocześnie do pary klucz wartość
        // entry jest referencją do jakiejś pary klcuz wartość
        for(Map.Entry entry : phones.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            //tak możemy zmieniać całą mape,
            //zmieniając coś na referencji zmieniamy nasza mape
            entry.setValue(0);
        }

        System.out.println(phones);
    }
}
