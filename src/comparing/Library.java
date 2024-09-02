package comparing;

public class Library {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Fourth Wing", "Rebeca Yarros", "FILIA", 2023),
            new Book("Fourth Wing", "Rebeca Yarros", "FILIA", 2023),
            new Book("Yellowface", "Rebecca Kuang", "Fabryka słów", 2023),
        };

        Book book1 = books[1];
        Book book2 = books[1];

        System.out.println("Książka 1: " + book1);
        System.out.println("Książka 2: " + book2);

        if (book1.equals(book2)) {
            System.out.println("To ta sama książka");
        } else {
            System.out.println("To dwie różne ksiązki");
        }
    }
}
