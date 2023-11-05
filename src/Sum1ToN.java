import java.util.Scanner;

public class Sum1ToN {

    public static void main(String[] args) {

        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //nastąpi oczekiwanie na wprowadzenie danych od uzytkownika

        int number = 1;
        int sum = 1;

        System.out.print("Suma 1");
        while (number < n) {
            number++;
            sum += number;
            System.out.print(" + " + number);
        }
        System.out.println(" = " + sum);
    }
}
