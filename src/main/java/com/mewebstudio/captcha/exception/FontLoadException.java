package com.mewebstudio.captcha.exception;

public class FontLoadException extends RuntimeException {
    public FontLoadException(String message) {
        super(message);
    }

    public FontLoadException(String message, Throwable cause) {
        super(message, cause);
    }
}
