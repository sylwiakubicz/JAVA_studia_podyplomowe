package constructors;

public class Demo {
    public static void main(String[] args) {
        new B1();
//        new B();
    }
}

class A1 {

    public A1() {
//        super(); // domyślnie jest tak wywoływana
        // wywołuje konstruktor klasy nadrzędnej (najczęsciej z klasy object bo każda klasa z tego dziedziczy)
        System.out.println("Działa kontruktor A");
    }
    public A1(String param) {
        System.out.println("Działa kontruktor A(" + param + ")");
    }

}

class B1 extends A1 {
    public B1() {
        System.out.println("Działa konstruktor B");
    }

    public B1(String param) {
        super(param);
        System.out.println("Działa kontruktor A(" + param + ")");
    }
}