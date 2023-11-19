package homework2;

public class GrainCounter {
    public static void main(String[] args) {

        int a = 5;
        int size = a * a;

        long sum = 0L;


        for (int i = 0; i < size; i++) {
            sum += (long) Math.pow(2, i);
        }

        System.out.println("Suma wynosi: " + sum);

    }
}
