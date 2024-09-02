package packages.pl.edu.wszib.java;

public class PackagePresenter {
    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }

    public PackagePresenter() {
        System.out.println("Raz dwa trzy...");
    }

    public void showPackage() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie " + this.getClass().getPackageName());
    }
}
