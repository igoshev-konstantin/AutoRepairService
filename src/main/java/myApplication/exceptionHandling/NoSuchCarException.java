package myApplication.exceptionHandling;

public class NoSuchCarException extends RuntimeException {

    public NoSuchCarException(String message){
        super(message);
    }
}
