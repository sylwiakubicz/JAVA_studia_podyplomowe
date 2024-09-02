package shelter;

public class Rabbit extends Animal{
    private static String type = "Rabbit";

    private static int rabbitCounter = 0;


    public Rabbit() {
        rabbitCounter++;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getInstanceCounter() {
        return rabbitCounter;
    }
}
