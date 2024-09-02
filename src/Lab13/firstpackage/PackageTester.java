package Lab13.firstpackage;

public class PackageTester {
    public void introduce() {
        System.out.println("Klasa " + this.getClass().getSimpleName() + " z pakietu " + this.getClass().getPackageName());
    }
}
