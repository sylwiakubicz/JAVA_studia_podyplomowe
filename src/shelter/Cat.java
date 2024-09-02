package shelter;

public class Cat extends Animal{
    private static String type = "Cat";
    private static int catCounter = 0;


    public Cat() {
        catCounter++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceCounter() {
        return catCounter;
    }
}
