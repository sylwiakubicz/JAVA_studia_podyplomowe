package loops;

public class Matrix {
    public static void main(String[] args) {

        int n = 4;
        int num = 1;

        System.out.println("n = " + n + "\tmatrix");
        System.out.println("----------------");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("  ");
                System.out.print(num);
                num++;
            }
            num -= n - 1;
            System.out.println();
        }

        // Rozwiązanie z zajęć
        System.out.println("n = " + n + "\tmatrix");
        System.out.println("----------------");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n ; j++) {
                System.out.printf("%3s", i + j + " ");
            }
            System.out.println();
        }
    }
}
