package com.mewebstudio.captcha.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.security.SecureRandom;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RandomStringGeneratorTest {
    @Test
    @DisplayName("Test RandomStringGenerator")
    public void testRandomStringGenerator() {
        int length = 10;
        Random random = new SecureRandom();
        String symbols = "ABCDEF123456";

        RandomStringGenerator generator = new RandomStringGenerator(length, random, symbols);

        // Test next()
        String randomString = generator.next();
        assertNotNull(randomString);
        assertEquals(length, randomString.length());

        // Test different generated strings
        String randomString2 = generator.next();
        String randomString3 = generator.next();
        assertNotEquals(randomString, randomString2);
        assertNotEquals(randomString2, randomString3);

        // Test length with only digits
        int digitsLength = 8;
        RandomStringGenerator digitsGenerator = new RandomStringGenerator(digitsLength, true);
        String digitsString = digitsGenerator.next();
        assertNotNull(digitsString);
        assertEquals(digitsLength, digitsString.length());

        // Test length with only alphabets (upper and lower case)
        int alphabetLength = 12;
        RandomStringGenerator alphabetGenerator = new RandomStringGenerator(alphabetLength, false);
        String alphabetString = alphabetGenerator.next();
        assertNotNull(alphabetString);
        assertEquals(alphabetLength, alphabetString.length());
        assertEquals(false, alphabetString.matches("^[a-zA-Z]*$")); // Check if the string contains only alphabets
    }
}
