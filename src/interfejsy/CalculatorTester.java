package interfejsy;

public class CalculatorTester {
    public static void main(String[] args) {
        Calculator adder = new Calculator() {
            @Override
            public int performOperation(int a, int b) {
                return a + b;
            }
        };

        System.out.println(adder.performOperation(1,2));
        adder.sampleDefaultMethod();

        // dzięki interfejsom funkcjonalnym możemy stosować krótki wyrażenia lambda
        // mozna tak zrobić bo ma tylko jedną metodę więc się nie musi zastanawiać o jaką metodę chodzi
        Calculator muliplier = (a,b) -> a * b;

        System.out.println(muliplier.performOperation(2,4));
        muliplier.sampleDefaultMethod();
    }
}
