package homework3;

public class Rectangle {

    private int width;
    private int height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
    public Rectangle(int w) {
        this.width = w;
        this.height = w;
    }

    double showArea() {
        return width * height;
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,10);
        Rectangle r3 = new Rectangle(20);
        System.out.println("Pole powierzchni - konstruktor bezparametrowy: " + r1.showArea());
        System.out.println("Pole powierzchni - konstruktor z dwoma paramtrami: " + r2.showArea());
        System.out.println("Pole powierzchni - konstruktor z jednym paramterem: " + r3.showArea());

    }

}
