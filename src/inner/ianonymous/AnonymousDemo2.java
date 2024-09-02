package inner.ianonymous;

public class AnonymousDemo2 {
    public static void main(String[] args) {
        AnonymousDemo2  anonymousDemo = new AnonymousDemo2();
        anonymousDemo.someMethod();
    }

    public interface GreetingModule{
        void sayHello();
    }

    public void someMethod() {
        GreetingModule greetingModule = new GreetingModule() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };
        greetingModule.sayHello();

    }
}
