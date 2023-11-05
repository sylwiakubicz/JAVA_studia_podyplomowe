package classes;

public class Vars {
    int i; // zmienna egzemplarza (pole klasy)
    static int j = 2; // zmienna klasowa (pole statyczne) a bez przypisania miałaby domyślne 0

    public int change() {
        int k = 7; // zmienna lokalna
        return i + (k * j);
    }

    public static void main(String[] args) {
        int i = 77; // jej zasięg kończy się wraz z klamrą zamykającą metodę main

        Vars v1 = new Vars(); // to też jest zmienna lokalna
        v1.i = 9;
        System.out.println("wyświetlamy zmienną egzemnplarza dla v1: " + v1.i);

        Vars v2 = new Vars(); // to też jest zmienna lokalna
        v2.i = 5;
        System.out.println("wyświetlamy zmienną egzemnplarza dla v2: " + v2.i); // natomiast tutaj nie można dać, że classes.Vars.i

        System.out.println("Wyświetlam zmeinną klasową (stytyczna): " + Vars.j); // można też zrobić v1.j albo v2.j ale jest to mniej czytelne

        System.out.println("Wyświetlam zmienną lokalną: " + i);
    }
}
