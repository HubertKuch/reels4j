package pl.hubertkuch.reels4j.exceptions;

public class CannotDownloadReelsException extends Exception {
    public CannotDownloadReelsException() {
    }

    public CannotDownloadReelsException(String message) {
        super(message);
    }

    public CannotDownloadReelsException(String message, Throwable cause) {
        super(message, cause);
    }

    public CannotDownloadReelsException(Throwable cause) {
        super(cause);
    }

    public CannotDownloadReelsException(
            String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace
    ) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
