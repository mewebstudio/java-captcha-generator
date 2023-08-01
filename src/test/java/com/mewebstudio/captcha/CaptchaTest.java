package com.mewebstudio.captcha;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.mewebstudio.captcha.util.RandomStringGenerator;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CaptchaTest {
    private Captcha captcha;

    @BeforeEach
    public void setUp() {
        // Mock the config with sample values
        Config config = new Config();
        config.setLength(6);
        config.setWidth(200);
        config.setHeight(50);
        config.setDark(false);
        config.setNoise(20);
        config.setDarkBackgroundColor(Color.BLACK);
        config.setLightBackgroundColor(Color.WHITE);

        // Create the Captcha instance with the mock config
        captcha = new Captcha(config);
    }

    @Test
    @DisplayName("Test Captcha.generate() method")
    public void testGenerateCaptcha() {
        // Create a mock for RandomStringGenerator
        String code = "ABC123";
        RandomStringGenerator randomStringGenerator = mock(RandomStringGenerator.class);
        when(randomStringGenerator.next()).thenReturn(code);

        // Set the mock generator in the Captcha instance
        captcha.setRandomStringGenerator(randomStringGenerator);

        // Generate the captcha
        GeneratedCaptcha generatedCaptcha = captcha.generate();

        // Verify that the generated captcha is not null
        assertNotNull(generatedCaptcha);

        // Verify that the generated captcha image is not null
        assertNotNull(generatedCaptcha.getImage());

        // Verify code
        assertEquals(code, generatedCaptcha.getCode());
    }
}
