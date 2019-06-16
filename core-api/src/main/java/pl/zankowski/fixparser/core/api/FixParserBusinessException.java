package pl.zankowski.fixparser.core.api;

public class FixParserBusinessException extends Exception {

    public FixParserBusinessException() {
    }

    public FixParserBusinessException(final String message) {
        super(message);
    }

    public FixParserBusinessException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
