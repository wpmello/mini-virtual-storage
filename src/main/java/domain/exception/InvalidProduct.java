package domain.exception;

public class InvalidProduct extends RuntimeException{
    public InvalidProduct(String message) {
        super(message);
    }
}
