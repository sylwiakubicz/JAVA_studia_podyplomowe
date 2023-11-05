package classes;

public class ScopeTest {
    int test = 10;

    void printTest() {
        int test = 20;
        System.out.println("Test: " + test); // zmienną lokalną wyświetlamy
        System.out.println("Test: " + this.test); // wyświetlanie zmiennej egzemlaprza
        // jakby nie było tej zmiennej lokalnej to this byłoby dodane domyślnie
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.printTest();
    }
}
