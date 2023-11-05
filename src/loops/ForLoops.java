package loops;

import javax.swing.plaf.IconUIResource;
import java.math.BigInteger;
import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Obliczanie silni
        int number = 5;
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.printf("%d! = %s%n", number, factorial);

        //    Wartości poszczególnych bitów w bajcie
        for (int i = 1, sum = 1; i <= 128; i *= 2, sum += i) {
            System.out.printf("i = %d, sum = %d%n", i, sum);
        }

//        wypisz liczby parzyste
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

//        Pętle zagnieżdżone i nazwane
        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                System.out.println(i + j);
                break out;
            }
        }
    }
}
