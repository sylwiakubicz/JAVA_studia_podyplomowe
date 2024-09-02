package interfejsy;



public class DefaultMethodTester implements MyInterface {

    public static void main(String[] args) {
        DefaultMethodTester dmt = new DefaultMethodTester();
        dmt.method();
        dmt.defaultMetod();

        MyInterface.staticMethod(); // Nie ma obiektu a mozemy wywołać metodę
        // obiekt nie ma dostepu do metody statycznej interfejsu
    }
    @Override
    public void method() {
        System.out.println("Wywołuję metodę zaimplementowaną w klasie");
    }
}


interface MyInterface {
    void method();
   // czasami implementacja jakiejś metody dla każdej klasy kożystającej z danego interfejsu jest taka sama
    // żeby nie powielać kodu, to można właśnie skorzystać z tej domyślnej moetody interfajsu
    // Zawsze  można nadpisać tą metodę
    // metoda domyślna może być zaimplementowana w interfejsie ale musi być jawnie oznaczona jako domyślna
    default void defaultMetod() {
        System.out.println("Wywołuję metodę zaimplementowaną w interfejsie (domyślną)" + sum(1,4));
    }

    // mogą być też metody statyczne
    // skoro mozemy implementowąć już metody w interfejsie to też pozwala na wywołanie danej metody bez konieczności tworzenia instancji klasy, która implementuje daną metode
    static void staticMethod() {
        System.out.println("Wywołanie metody statycznej wywołanej w interfejsie");
    }


    // meotdy, które są zdefiniowane na potrzebę metod wewnętrznych defaultowych
    private int sum (int a, int b) {
        return a + b;
    }
}