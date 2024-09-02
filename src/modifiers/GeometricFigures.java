package modifiers;

public class GeometricFigures {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,5);
        Triangle triangle = new Triangle(4, 2);

        showArea(rectangle);
        showArea(triangle);

        Shape[] shapes = {rectangle, triangle};

        for (Shape shape : shapes) {
            System.out.println("--------" + shape.getArea());
        }
    }

    public static void showArea(Shape shape) {
        System.out.println("Pole powierzchni: " + shape.getArea());
    }

}
