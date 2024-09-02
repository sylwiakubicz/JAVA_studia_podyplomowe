package nospecifycategory;

public class MyShelf {
    public static void main(String[] args) {
        Shelf myShelf = new Shelf();
        myShelf.depth = 20;
        myShelf.height = 180;
        myShelf.width = 100;

        System.out.println("My shelf is " + myShelf.height + "cm high, " + myShelf.width + "cm wide and " + myShelf.depth + "cm deep.");
    }
}
