package arrays;//Napisz program posiadający metodę o nazwie showMatrix() wyświetlającą na ekranie dowolną dwuwymiarową tablicę liczb całkowitych w postaci macierzy. Zaprezentuj działanie metody.
//
//        Przykład:
//        1   2   4
//        3   2   5
//        1   1   1


public class Array2DPrinter {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 4}, {3, 2, 5}, {1, 1, 1}, {2, 3, 4}};
        showMatrix(array);
    }

    static void showMatrix(int[][] arrayToPrint) {
        System.out.println("2D Array: ");
        for (int i = 0; i < arrayToPrint.length; i++) {
            for (int j = 0; j < arrayToPrint[i].length; j++) {
                System.out.printf("%2d", arrayToPrint[i][j]);
            }
            System.out.println();
        }
    }
}
