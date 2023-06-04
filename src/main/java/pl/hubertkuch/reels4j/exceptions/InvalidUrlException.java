package pl.hubertkuch.reels4j.exceptions;

public class InvalidUrlException extends Exception {
    public InvalidUrlException(String message) {
        super(message);
    }

    public InvalidUrlException(String message, Throwable cause) {
        super(message, cause);
    }
}
