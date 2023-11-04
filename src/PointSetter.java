import java.awt.*;

public class PointSetter {

    public static void main(String[] args) {
        Point location = new Point(4, 13);

        System.out.println("Położenie początkowe: " );
        System.out.println("X równe: " + location.x);
        System.out.println("Y równe: " + location.y);

        System.out.println("\nPrzejście do wartości (7, 6)");
        location.x = 7;
        location.y = 6;
        System.out.println("X równe: " + location.x);
        System.out.println("Y równe: " + location.y);
    }
}
