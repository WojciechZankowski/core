package pl.zankowski.fixparser.core.api;

public class FixParserSystemException extends RuntimeException {

    public FixParserSystemException() {
    }

    public FixParserSystemException(final String message) {
        super(message);
    }

    public FixParserSystemException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
