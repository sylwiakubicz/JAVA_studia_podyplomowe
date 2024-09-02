package overloading;

public class People {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        Boy boy = new Boy();
        boy.eat();
    }
}

class Human {
    void eat() {
        System.out.println("Human eats");
    }
}

class Boy extends Human {
    void eat() {
        System.out.println("Boy eats");
    }
}