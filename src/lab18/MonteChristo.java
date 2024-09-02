package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MonteChristo {
    public static void main(String[] args) {
        MonteChristo monteChristo = new MonteChristo();
        List<String> book = monteChristo.loadTextFile("HrabiaMonteChristo.txt");

        if (book != null && !book.isEmpty()) {
            System.out.println("Ilość wierszy: " + monteChristo.listSize(book));

            System.out.println("\nCo 100 wiersz z książki: ");
            monteChristo.printEvery100thLine(book);

            monteChristo.theLongestBookRow(book);
        }
    }

    List<String> loadTextFile(String textFileName) {
        try {
            return Files.readAllLines(Paths.get("src/lab18/" + textFileName));
        } catch (IOException e) {
            System.out.println("Coś poszło nie tak. " + e.getMessage());
        }
        return null;
    }

    int listSize(List list) {
        return list.size();
    }

    void printEvery100thLine(List list) {
        for (int i = 100; i < listSize(list); i += 100) {
            System.out.print(i + " ");
            System.out.println(list.get(i - 1));
        }
    }

    void theLongestBookRow(List<String> list) {
        String longestRowText = "";
        for (String line: list) {
            if (line.length() > longestRowText.length()) {
                longestRowText = line;
            }
        }
        System.out.println("Najdłuższ wiersz w książce brzmi: " + longestRowText.toUpperCase());
    }
}
