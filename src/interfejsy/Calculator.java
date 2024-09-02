package interfejsy;

// interfejst funkcyjny - nie trzeba specjalnie oznaczać ale się przyjęło żeby oznaczą
@FunctionalInterface // oznaczamy tak, bo wtedy nam sprawdza, czy na pewno mamy doczynienia z interfejsem funkcyjnym
public interface Calculator {

    // jedyna abstakcyjna metoda
    int performOperation(int a, int b);

    static void sampleStaticMethod () {
        System.out.println("Statyczna metoda");
    }

    default void sampleDefaultMethod() {
        System.out.println("Domyślna metoda");
    }
}
