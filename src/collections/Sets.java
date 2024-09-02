package collections;

import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        //Ten zbiór jest uporządkowany
        Set<String> words = new TreeSet<>();
        words.add("kobra");
        words.add("żmija");
        words.add("żmija");
        words.add("żmija");
        words.add("anakonda");
        words.add("anakonda");
        words.add("anakonda");

        System.out.println(words);
        // jeśli chcemy użyć implementacji konkretnie z TreeSet to musimy nasz set na to zmapować
        //bo początkowo zadeklarowaliśmy że nasz zbiór jest ogólnie Set
        // żeby nie trzeba było mapować to musielibyśmy od razu zadeklarować, że words to TreeSet<>
        // TreeSet<String> words = new TreeSet<>();
        System.out.println(((TreeSet<String>)words).descendingSet());
    }
}
