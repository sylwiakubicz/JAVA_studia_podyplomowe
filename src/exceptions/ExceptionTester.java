package exceptions;

public class ExceptionTester {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println("Nasz numer to: " + numbers[3]);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak! " + e.getMessage());
        } finally {
            System.out.println("Koniec");
        }
    }
}
