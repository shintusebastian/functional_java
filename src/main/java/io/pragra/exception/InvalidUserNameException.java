package io.pragra.exception;

public class InvalidUserNameException extends Exception{
    public InvalidUserNameException() {
        super("Provide Valid User Name");
    }
}
