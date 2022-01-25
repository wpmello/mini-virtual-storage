package domain.exception;

// Uma exceção personalizada criada para informar de forma amigável o porquê do erro
public class InvalidProduct extends RuntimeException{
    public InvalidProduct(String message) {
        super(message);
    }
}
