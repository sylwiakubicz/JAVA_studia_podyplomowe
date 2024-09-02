package homework2;


import java.math.BigInteger;

public class GrainCounterV2 {
    public static void main(String[] args) {

        int a = 8;
        int size = a * a;

        BigInteger sum = new BigInteger("0");


        for (int i = 0; i < size; i++) {
            BigInteger toAdd = BigInteger.valueOf((long) Math.pow(2, i));
            sum = sum.add(toAdd);
        }

        System.out.println("Suma wynosi: " + sum);

    }
}
