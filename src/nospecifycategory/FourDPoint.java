package nospecifycategory;

import java.awt.*;

public class FourDPoint extends Point {

    int z;
    int t;

    public static void main(String[] args) {
        FourDPoint FourDPoint = create(2, 4, 6, 8);
        FourDPoint.show();
    }

    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint FourDPoint = new FourDPoint();
        FourDPoint.x = x;
        FourDPoint.y = y;
        FourDPoint.z = z;
        FourDPoint.t = t;
        return FourDPoint;
    }

    void show() {
        System.out.println("x: " + this.x + ", y: " + this.y + ", z: " + this.z + ", t: " + this.t  + ".");
    }
}
