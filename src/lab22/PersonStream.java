package lab22;

import java.util.ArrayList;
import java.util.List;

public class PersonStream {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Sylwia", 23));
        people.add(new Person("Tomek", 18));
        people.add(new Person("Wojtek", 20));
        people.add(new Person("Karolina", 32));
        people.add(new Person("Anna", 14));
        people.add(new Person("Staś", 10));

        List<String> names = people.stream()
                .filter(person -> person.getAge() > 18)
                .map(Person::getName)
                .toList();

        System.out.println("Imiona osób powyżej 18 lat: " + names);

    }
}
