package homework2;

public class XmasTree {
    public static void main(String[] args) {
        char[] asciiChars = {'+', '.', '*', '~', '^', 'o'};
        int asciiCharsSize = asciiChars.length;

        int size;
        if (args.length != 0) {
            size = Integer.parseInt(args[0]);
        } else {
            size = 18;
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                int randomIndex = (int)(Math.random() * asciiCharsSize);
                System.out.print(asciiChars[randomIndex]);
            }
            System.out.println();
        }
    }
}
