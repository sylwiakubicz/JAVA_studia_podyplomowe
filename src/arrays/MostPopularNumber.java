package arrays;

public class MostPopularNumber {
    public static void main(String[] args) {

        int[] numbers = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};

        int currentCheckingNumber;
        int counter = 0;

        int mostPopularNumber = 0;
        int mostFrequent = 0;

        for (int checkingNumber : numbers) {
            currentCheckingNumber = checkingNumber;

            // Liczymy ile razy nasza sprawdzana cyfra występuje w całej tablicy
            for (int number : numbers ) {
                if (currentCheckingNumber == number) {
                    counter += 1;
                }
            }

            // Porównanie aktualnych wyników
            if (counter > mostFrequent) {
                mostPopularNumber = currentCheckingNumber;
                mostFrequent = counter;
            }

            // Resetujemy counter dla kolejnego elementu
            counter = 0;
        }

        System.out.println(mostPopularNumber + " (" + mostFrequent + " razy)");


    // ROZWIĄZANIE Z ZAJĘĆ
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
        int[] counters = new int[10];

        for (int number : arr) {
            counters[number]++;
        }

        int mostFrequentNumber = 0;

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] > counters[mostFrequentNumber]) {
                mostFrequentNumber = i;
            }
        }

        System.out.print("Najczęściej występującą cyfrą w tablicy jest cyfra " + mostFrequentNumber);
        System.out.println(", wystąpiła " + counters[mostFrequentNumber] + " razy.");

    }

}
