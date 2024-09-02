package interfejsy;

public class PolymorphisAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Bird()}; // można przechowywać w jednej tablicy bo są zwierzętami

        for (Animal animal: animals) {
            animal.makeSound();
        }
    }
}
