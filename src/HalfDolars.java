public class HalfDolars {
    public static void main(String[] args) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000}; // utworzy się tablica o size 3
        int[] philadelphia = new int[denver.length];
        int[] total = new int[denver.length];
        int average = 0;

        philadelphia[0] = 1_800_000;
        philadelphia[1] = 5_000_000;
        philadelphia[2] = 2_500_000;

        for (int i = 0; i < denver.length; i++) {
            total[i] = denver[i] + philadelphia[i];
            average += total[i];
        }

        average = average / total.length;

        System.out.println("Produkcja z 2012: ");
        System.out.printf("%,d%n", total[0]);
        System.out.println("Produkcja z 2013: ");
        System.out.printf("%,d%n", total[1]);
        System.out.println("Produkcja z 2014: ");
        System.out.printf("%,d%n", total[2]);

        System.out.println("średnia produkcja: ");
        System.out.printf("%,d%n", average);

    }
}
