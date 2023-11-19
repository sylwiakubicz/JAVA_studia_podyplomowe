public class SquareRoot {

    public static void main(String[] args) {

        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            System.out.println("Pierwiastek kwadratowy wynosi: " + Math.sqrt( number));
        }
    }
}
