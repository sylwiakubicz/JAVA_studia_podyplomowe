public class ThisTester {
    public static void main(String[] args) {
        ObjectInformator.show(new String("Ala"));

        Number number = new Number(3);
        number.showObjectInfo();
    }
}

class ObjectInformator {
    static void show(Object o) {
        System.out.println(o.getClass().getSimpleName());
        System.out.println(o.getClass().getPackageName());
        System.out.println(o);
        System.out.println();
    }
}

class Number {
    public int value;

    public Number(int value) {
        this.value = value;
    }

    public void showObjectInfo() {
        ObjectInformator.show(this);
    }
}