package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Alice {
    public static void main(String[] args) {
        String filePath = "src/lab18/alice.txt";
        List<String> allLines = loadTextFile(filePath);

        if (allLines != null) {
            Set<String> words = divideIntoWordsAndClean(allLines);
            System.out.println("Liczba różnych wyrazów to: " + words.size() + ".");

            Map<Character, Integer> firstLetterStats = createFirstLetterStats(words);

            Map.Entry<Character, Integer> entry = findFirstLetterCommonWord(firstLetterStats);
            System.out.println("Najwięcej wyrazów zaczyna się na literę: \"" + entry.getKey() + "\", jest ich " + entry.getValue());
        }

    }

    private static Map.Entry<Character, Integer> findFirstLetterCommonWord(Map<Character, Integer> firstLetterStats) {
        Map.Entry<Character, Integer> mostCommonFirstLetterEntry = null;
        for (Map.Entry<Character, Integer> entry : firstLetterStats.entrySet()) {
            if (mostCommonFirstLetterEntry == null || entry.getValue() > mostCommonFirstLetterEntry.getValue()) {
                mostCommonFirstLetterEntry = entry;
            }
        }
        return mostCommonFirstLetterEntry;

    }

    private static Map<Character, Integer> createFirstLetterStats(Set<String> words) {
        Map<Character, Integer> firstLetterStats = new TreeMap<>();
        for (String word : words) {
            Character firstLetter = word.charAt(0);
            firstLetterStats.put(firstLetter, firstLetterStats.getOrDefault(firstLetter, 0) + 1);
        }
        return firstLetterStats;
    }

    private static Set<String> divideIntoWordsAndClean(List<String> allLines) {
        Set<String> words = new TreeSet<>();
        for (String line : allLines) {
            String[] lineWords = line.split(" |--");
            for (String word : lineWords) {
                word = cleanWord(word);
                if (!word.isEmpty()) {
                    words.add(word.toLowerCase());
                }
            }
        }
        return words;
    }

    private static List<String> loadTextFile(String filePath) {
        try {
            return Files.readAllLines(Paths.get(filePath));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak: " + e.getMessage());
        }
        return null;
    }

    private static String cleanWord(String word) {
        return word.replaceAll("\\p{Punct}|\\d","");
    }
}
