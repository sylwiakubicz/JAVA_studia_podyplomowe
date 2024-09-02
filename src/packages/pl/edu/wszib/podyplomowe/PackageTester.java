package packages.pl.edu.wszib.podyplomowe;

import packages.pl.edu.wszib.java.PackagePresenter;

public class PackageTester {
    public static void main(String[] args) {
        PackagePresenter pp1 = new PackagePresenter();
        pp1.showPackage();

        packages.pl.edu.wszib.podyplomowe.PackagePresenter pp2 = new packages.pl.edu.wszib.podyplomowe.PackagePresenter();
        pp2.showPackage();
    }
}
