package packages.pl.edu.wszib.podyplomowe;

public class PackagePresenter {
    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();
    }
    public void showPackage() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie " + this.getClass().getPackageName());
    }
}
