package shelter;

import java.util.Random;

public class AnimalShelter {
    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Cat();
                    break;
                case 1:
                    animals[i] = new Dog();
                    break;
                case 2:
                    animals[i] = new Rabbit();
                    break;
            }
        }

        System.out.println("W kojcu o numerze 33 znajduje się " + animals[32].getType() + ". W schronisku jest obecnie " + animals[32].getInstanceCounter() + " takich zwierząt.");

    }

}
