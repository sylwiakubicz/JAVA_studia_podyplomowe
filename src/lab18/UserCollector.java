package lab18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserCollector {

    public static void main(String[] args) {
        Map<Integer, User> users = new HashMap<>();

        User user1 = new User("Anna", "Nowak", 40);
        User user2 = new User("Piotr", "Bąk", 24);
        User user3 = new User("Sylwia", "Kubicz", 23);

        users.put(1, user1);
        users.put(2, user2);
        users.put(3, user3);

        System.out.println("Użytkownik o identyfikatorze 3: " + users.get(3));

        for (User user : users.values()) {
            System.out.println(user);
        }

        for (Map.Entry<Integer, User> entry : users.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
