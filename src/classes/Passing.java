package classes;

import java.awt.*;

public class Passing {
    public static void main(String[] args) {
        int i = 10;
        System.out.println("przed zmianną " + i);
        Passing.changeIt(i);
        System.out.println("po zmianie: " + i); // zmiana i była tylko lokalnei

        Point p = new Point(1, 1);
        System.out.println("przed zmianą: " + p);
        changeIt(p);
        System.out.println("po zmianie: " + p); // adres się zmieni

    }
    static void changeIt(int i) {
        System.out.println("zmieniam i");
        i++;
    }
    static void changeIt(Point p) {
        System.out.println("zmieniam to na co wskazuje p");
        p.x++;
        p.y++;
    }
}
