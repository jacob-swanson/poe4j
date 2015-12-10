package com.swandiggy.poe4j;

/**
 * @author Jacob Swanson
 * @since 12/9/2015
 */
public class Poe4jException extends RuntimeException {
    public Poe4jException() {
        super();
    }
    public Poe4jException(String message) {
        super(message);
    }
    public Poe4jException(String message, Throwable cause) {
        super(message, cause);
    }
    public Poe4jException(Throwable cause) {
        super(cause);
    }
}
