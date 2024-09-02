package nospecifycategory;

public class SquareRoot {

    public static void main(String[] args) {

        if (args.length > 0) {
            double number = Double.parseDouble(args[0]);
            System.out.println("Pierwiastek kwadratowy wynosi: " + Math.sqrt( number));
        }
    }
}
