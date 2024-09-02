package constructors;

import org.graalvm.collections.EconomicMapUtil;

public class lab11 {
    public static void main(String[] args) {
        System.out.println("Start!");
        new C(true);
    }
}

class A {
    A() {
        System.out.println("Konstruktor A");
    }

    A(boolean notInform) {
        if (!notInform) {
            System.out.println("Konstruktor A(" + notInform + ")");
        }
    }
}

class B extends A {
    B() {
        System.out.println("Konstruktor B");
    }
    B(boolean notInform) {
        super(true);
        if (!notInform) {
            System.out.println("Konstruktor B(" + notInform + ")");
        }
    }
}
class C extends B {
    C() {
        System.out.println("Konstruktor C");
    }
    C(boolean notInform) {
        super(true);
        if (!notInform) {
            System.out.println("Konstruktor C(" + notInform + ")");
        }
    }
}
