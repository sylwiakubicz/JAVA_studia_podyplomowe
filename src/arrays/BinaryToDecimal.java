package arrays;

public class BinaryToDecimal {

    public static void main(String[] args) {

        String binaryNumber = "1010101010101011";
        long decimalNumber = 0L;

        int binaryNumberLength = binaryNumber.length();
        int reversIndex = 1;

        for (int i = 0; i < binaryNumberLength; i++) {
            reversIndex = binaryNumberLength - 1 - i;

            if (binaryNumber.charAt(i) == '0') {
                continue;
            }

            decimalNumber += (int)Math.pow(2, reversIndex);
        }

        System.out.println(decimalNumber);
    }
}
