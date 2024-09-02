package lab18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Demo {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println(Files.readAllLines(Paths.get("src/data2.txt")));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
