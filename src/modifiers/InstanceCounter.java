package modifiers;

public class InstanceCounter {
    private static int numInstances = 0;

    public static int getCount() {
        return numInstances;
    }

    public InstanceCounter() {
        numInstances++;
    }

    public static void main(String[] args) {
        System.out.print("Rozpoczynamy z ");
        System.out.println(InstanceCounter.getCount() + " obiektów.");
        for (int i = 0; i < 100; i++) {
            new InstanceCounter();
        }
        System.out.print("Utworzono: ");
        System.out.println(InstanceCounter.getCount() + " obiektów.");

    }

}
