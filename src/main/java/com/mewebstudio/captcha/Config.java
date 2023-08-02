package com.mewebstudio.captcha;

import java.awt.*;

public final class Config {
    private int width = 120;

    private int height = 40;

    private int length = 5;

    private int noise = 15;

    private boolean dark = false;

    private Color[] lightPalette = {Color.BLACK, Color.DARK_GRAY, Color.BLUE, Color.GREEN, Color.RED};

    private Color[] darkPalette = {Color.WHITE, Color.LIGHT_GRAY, Color.CYAN, Color.MAGENTA, Color.ORANGE};

    private Color darkBackgroundColor = new Color(30, 30, 30);

    private Color lightBackgroundColor = Color.WHITE;

    private int[] fontStyles = {Font.PLAIN, Font.BOLD, Font.ITALIC, Font.BOLD + Font.ITALIC};

    private String[] fonts = {};

    public Config() {
    }

    public Config(int width, int height, int length, int noise, boolean dark, Color[] lightPalette, Color[] darkPalette,
                  Color lightBackgroundColor, Color darkBackgroundColor, int[] fontStyles, String[] fonts) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.noise = noise;
        this.dark = dark;
        this.lightPalette = lightPalette;
        this.darkPalette = darkPalette;
        this.lightBackgroundColor = lightBackgroundColor;
        this.darkBackgroundColor = darkBackgroundColor;
        this.fontStyles = fontStyles;
        this.fonts = fonts;
    }

    public Config(int width, int height, int length, int noise, boolean dark, Color lightBackgroundColor,
                  Color darkBackgroundColor) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.noise = noise;
        this.lightBackgroundColor = lightBackgroundColor;
        this.darkBackgroundColor = darkBackgroundColor;
        this.dark = dark;
    }

    public Config(int width, int height, int length, int noise, boolean dark) {
        this.width = width;
        this.height = height;
        this.length = length;
        this.noise = noise;
        this.dark = dark;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getNoise() {
        return noise;
    }

    public void setNoise(int noise) {
        this.noise = noise;
    }

    public boolean isDark() {
        return dark;
    }

    public void setDark(boolean dark) {
        this.dark = dark;
    }

    public String[] getFonts() {
        return fonts;
    }

    public void setFonts(String[] fonts) {
        this.fonts = fonts;
    }

    public Color[] getLightPalette() {
        return lightPalette;
    }

    public void setLightPalette(Color[] palettes) {
        this.lightPalette = palettes;
    }

    public Color[] getDarkPalette() {
        return darkPalette;
    }

    public void setDarkPalette(Color[] palette) {
        this.darkPalette = palette;
    }

    public int[] getFontStyles() {
        return fontStyles;
    }

    public Color getDarkBackgroundColor() {
        return darkBackgroundColor;
    }

    public void setDarkBackgroundColor(Color color) {
        this.darkBackgroundColor = color;
    }

    public Color getLightBackgroundColor() {
        return lightBackgroundColor;
    }

    public void setLightBackgroundColor(Color color) {
        this.lightBackgroundColor = color;
    }

    public void setFontStyles(int[] styles) {
        this.fontStyles = styles;
    }
}
