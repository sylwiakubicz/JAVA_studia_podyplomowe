public class ArraysIteration {
    public static void main(String[] args) {

        // TABLICA JEDNOWYMIAROWA
        int[] arr = {1, 2, 3, 5, 7, 12, 45};

        // a) pierwszy sposób
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // b) drugi sposób
        for (int number : arr) {
            System.out.println(number);
        }

        // TABLICE WIELOWYMIAROWE

        // a) 2-wymiarowa
        String[] dogs = {"Burek", "Pluto", "Łajka"};
        String[] people = {"Ania", "Wojtek", "Dorota"};

        String[][] names = {dogs, people};

        // Tablica names ma dwa elementy o indexie 0 i 1
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.printf(names[i][j] + " ");
            }
            System.out.println();
        }

        // b) 3-wymiarowa
        int[][][] multi = {{{1,2}}, {{3, 4}}, {{5,6}}};
    }
}
