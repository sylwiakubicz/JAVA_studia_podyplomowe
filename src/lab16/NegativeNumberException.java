package lab16;

public class NegativeNumberException extends IllegalArgumentException{
    public NegativeNumberException() {
        super();
    }

    public NegativeNumberException(String message) {
        super(message);
    }
}
