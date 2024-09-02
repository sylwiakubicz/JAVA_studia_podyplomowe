package overloading;

import java.awt.*;

public class Box {
    int x1 = 0;
    int y1 = 0;
    int x2 = 0;
    int y2 = 0;

    public static void main(String[] args) {
        Box rect = new Box();

        System.out.println("\n\nTworzymy Box ze współrzędnymi (25, 25) i (50, 50)");
        rect.buildBox(25, 25, 50, 50);
        rect.printBox();

        System.out.println("\n\nTworzymy Box z punktami (10, 10) i (20, 20)");
        rect.buildBox(new Point(10, 10), new Point(20, 20));
        rect.printBox();

        System.out.println("\n\nTworzymy Box z punktem (7, 9), szerokością 50 i wysokością 20");
        rect.buildBox(new Point(7, 9), 50, 20) ;
        rect.printBox();
    }

    Box buildBox(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        return this;
    }

    Box buildBox(Point topLeft, Point bottomRight) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = bottomRight.x;
        y2 = bottomRight.y;
        return this;
    }

    Box buildBox(Point topLeft, int w, int h) {
        x1 = topLeft.x;
        y1 = topLeft.y;
        x2 = x1 + w;
        y2 = y1 + h;
        return this;
    }

    void printBox() {
        System.out.printf("Box: <" + this.x1 + ", " + this.y1);
        System.out.println("; " + this.x2 + ", " + this.y2 + ">");
    }
}
