package com.mewebstudio.captcha;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;

public class GeneratedCaptchaTest {
    @Test
    @DisplayName("Test GeneratedCaptcha")
    public void testGeneratedCaptcha() {
        // Create a sample BufferedImage
        BufferedImage image = new BufferedImage(100, 50, BufferedImage.TYPE_INT_RGB);

        // Create a sample code
        String code = "ABC123";

        // Create a GeneratedCaptcha instance
        GeneratedCaptcha captcha = new GeneratedCaptcha(image, code);

        // Verify that the properties are set correctly
        assertEquals(image, captcha.getImage());
        assertEquals(code, captcha.getCode());
    }
}
