package arrays;

import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        // Możliwe deklaracje tablic
            // a) nawias po typie tablicy
            String[] requests;
            Point[] points;
            float[] donations;
            // b) nawias po nazwie tablicy
            String target[];

        // Inicjalizacja tablicy
        int[] temps = new int[99];
        System.out.println(temps[20]); // 0
        temps[22] = 77;
        System.out.println(temps[22]); // 77

        // Tablice o typie obiektowym
            // tutaj jeśli nie przypiszemy wartości do danego indeksu to będzie
            // w nim przechowywana wartość null bo to typ obiektowy a nie jak wyżej
            // zwykły type int dla którego niezapełnione w tablicy miejsce przechpwuje 0
            Integer[] series = new Integer[3];
            series[0] = 10;
            series[1] = 3;
          // series[2] = 5;

            System.out.println(series[0] + " " + series[1] + " " + series[2]); // 10 3 null

        // bardziej kompaktowy sposób
            Integer[] seriesV2 = {10, 3, 5};
            System.out.println(seriesV2[0] + " " + seriesV2[1] + " " + seriesV2[2]); // 10 3 5

        // Tablica znakow
            char[] letters = {'a', 'b', 'c'};
            System.out.println(letters[0]); // a


      // Tablica wskaźników
//        Point[] pointsV2 = {new Point(1,1), new Point(2,2), new Point(3,3)};

        Point point = new Point(1, 1);
        Point[] pointsV3 = new Point[3];
        pointsV3[0] = point;
        pointsV3[1] = pointsV3[0];
        pointsV3[2] = pointsV3[1];

        pointsV3[1].x = 50;

        System.out.println(pointsV3[0]); // java.awt.Point[x=50,y=1]
        System.out.println(pointsV3[1]); // java.awt.Point[x=50,y=1]
        System.out.println(pointsV3[2]); // java.awt.Point[x=50,y=1]

    }
}
