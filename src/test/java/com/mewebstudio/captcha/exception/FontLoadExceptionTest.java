package com.mewebstudio.captcha.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FontLoadExceptionTest {
    @Test
    @DisplayName("Test FontLoadException")
    public void testFontLoadExceptionWithMessage() {
        String errorMessage = "Failed to load font!";
        FontLoadException exception = new FontLoadException(errorMessage);
        assertEquals(errorMessage, exception.getMessage());
        assertNull(exception.getCause());
    }

    @Test
    @DisplayName("Test FontLoadException with message and cause")
    public void testFontLoadExceptionWithMessageAndCause() {
        String errorMessage = "Failed to load font!";
        Throwable cause = new RuntimeException("Font file not found");
        FontLoadException exception = new FontLoadException(errorMessage, cause);
        assertEquals(errorMessage, exception.getMessage());
        assertEquals(cause, exception.getCause());
    }
}
