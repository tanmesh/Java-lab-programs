package unchecked;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String message) {
        super(message);
    }
}
