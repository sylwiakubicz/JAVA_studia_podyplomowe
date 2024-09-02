package shelter;

public class Dog extends Animal{
    private static String type = "Dog";

    private static int dogCounter = 0;


    public Dog() {
        dogCounter++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceCounter() {
        return dogCounter;
    }
}
