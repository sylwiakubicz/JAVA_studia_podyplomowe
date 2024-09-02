package Lab13;

import Lab13.firstpackage.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();

        Lab13.secondpackage.PackageTester pt2 = new Lab13.secondpackage.PackageTester();
        pt2.introduce();

        Lab13.thirdpackage.PackageTester pt3 = new Lab13.thirdpackage.PackageTester();
        pt3.introduce();
    }
}
