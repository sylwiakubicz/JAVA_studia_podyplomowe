package overloading;

public class Calculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int res1 = calc.add(1, 2);
        double res2 = calc.add(1.5, 1.5);
        System.out.println("res1: " + res1 + ", res2: " + res2);
    }

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
