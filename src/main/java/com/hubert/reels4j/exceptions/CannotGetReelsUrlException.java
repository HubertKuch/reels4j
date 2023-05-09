package com.hubert.reels4j.exceptions;

public class CannotGetReelsUrlException extends Exception {
    public CannotGetReelsUrlException() {
    }

    public CannotGetReelsUrlException(String message) {
        super(message);
    }

    public CannotGetReelsUrlException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotGetReelsUrlException(Throwable cause) {
        super(cause);
    }
}
