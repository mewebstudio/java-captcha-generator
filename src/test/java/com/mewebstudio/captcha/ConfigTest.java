package com.mewebstudio.captcha;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.Color;
import java.awt.Font;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConfigTest {
    @Test
    @DisplayName("Test Config default constructor")
    public void testConfigDefaultConstructor() {
        Config config = new Config();
        assertEquals(120, config.getWidth());
        assertEquals(40, config.getHeight());
        assertEquals(5, config.getLength());
        assertEquals(15, config.getNoise());
        assertEquals(false, config.isDark());
        assertEquals(Color.BLACK, config.getLightPalette()[0]);
    }

    @Test
    @DisplayName("Test Config parameterized constructor")
    public void testConfigParameterizedConstructor() {
        Color[] lightPalette = {Color.CYAN, Color.GREEN};
        Color[] darkPalette = {Color.DARK_GRAY, Color.BLUE};
        int[] fontStyles = {Font.BOLD, Font.ITALIC};

        Config config = new Config(200, 60, 7, 20, true, lightPalette, darkPalette, Color.YELLOW, Color.GRAY, fontStyles, null);

        assertEquals(200, config.getWidth());
        assertEquals(60, config.getHeight());
        assertEquals(7, config.getLength());
        assertEquals(20, config.getNoise());
        assertEquals(true, config.isDark());
        assertArrayEquals(lightPalette, config.getLightPalette());
        assertArrayEquals(darkPalette, config.getDarkPalette());
        assertEquals(Color.YELLOW, config.getLightBackgroundColor());
        assertEquals(Color.GRAY, config.getDarkBackgroundColor());
        assertArrayEquals(fontStyles, config.getFontStyles());
    }

    @Test
    @DisplayName("Test Config setter methods")
    public void testConfigSetterMethods() {
        Config config = new Config();

        config.setWidth(150);
        config.setHeight(50);
        config.setLength(6);
        config.setNoise(25);
        config.setDark(true);

        assertEquals(150, config.getWidth());
        assertEquals(50, config.getHeight());
        assertEquals(6, config.getLength());
        assertEquals(25, config.getNoise());
        assertEquals(true, config.isDark());

        Color[] lightPalette = {Color.YELLOW, Color.MAGENTA};
        config.setLightPalette(lightPalette);
        assertArrayEquals(lightPalette, config.getLightPalette());

        Color[] darkPalette = {Color.RED, Color.GREEN};
        config.setDarkPalette(darkPalette);
        assertArrayEquals(darkPalette, config.getDarkPalette());

        int[] fontStyles = {Font.PLAIN, Font.BOLD};
        config.setFontStyles(fontStyles);
        assertArrayEquals(fontStyles, config.getFontStyles());

        Color lightBackgroundColor = Color.CYAN;
        config.setLightBackgroundColor(lightBackgroundColor);
        assertEquals(lightBackgroundColor, config.getLightBackgroundColor());

        Color darkBackgroundColor = Color.BLUE;
        config.setDarkBackgroundColor(darkBackgroundColor);
        assertEquals(darkBackgroundColor, config.getDarkBackgroundColor());

        String[] fonts = {"font1.ttf", "font2.ttf"};
        config.setFonts(fonts);
        assertArrayEquals(fonts, config.getFonts());
    }
}
