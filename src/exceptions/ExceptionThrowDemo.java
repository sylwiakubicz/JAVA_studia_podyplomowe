package exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours = 3;
        int numberOfSeconds = 0;
    }

    public int getNumberOfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Liczba godzin musi być większa od 0: " + hours);
        }
        return hours * 60 * 60;
    }
}
