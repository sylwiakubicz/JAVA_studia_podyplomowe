package overloading;

public class Adder {

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(2, 3,4));
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


}
