package interfejsy;

public class Bird implements Animal{
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}
