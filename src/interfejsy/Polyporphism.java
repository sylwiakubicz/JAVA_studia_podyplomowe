package interfejsy;

public class Polyporphism {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(rectangle instanceof Shape);

        shape = new Rectangle();
        shape.draw();
    }
}

class Shape {
    void draw() {
        System.out.println("rysuje ...");
    }
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("Rysuję prostokąt");
    }
}

class Circle extends Shape{
    void draw() {
        System.out.println("Rysuję koło");
    }
}

class Triangle extends Shape{
    void draw() {
        System.out.println("Rysuję trójkąt");
    }
}

