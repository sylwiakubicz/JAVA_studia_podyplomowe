package exceptions;

public class UncheckedExceptions {
    public static void main(String[] args) {
        UncheckedExceptions uce = new UncheckedExceptions();
        int i = uce.getNumberFromString("o");
        System.out.println("Oto nasza liczba pomnożona przez 99: " + (i * 99));
    }

    public int getNumberFromString(String number) {
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException e) {
            System.out.println("Błąd: " + e.getMessage());
            System.exit(-1);
        }
        return -1;
    }
}
