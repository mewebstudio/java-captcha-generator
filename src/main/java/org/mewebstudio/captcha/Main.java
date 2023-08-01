package org.mewebstudio.captcha;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Captcha captcha = new Captcha();
        captcha.getConfig().setDark(true);
        GeneratedCaptcha generatedCaptcha = captcha.generate();

        String filePath = "captcha.png";
        File outputFile = new File(filePath);
        try {
            ImageIO.write(generatedCaptcha.getImage(), "png", outputFile);
            System.out.println("Captcha saved: " + filePath);
            System.out.println("Captcha code: " + generatedCaptcha.getCode());
        } catch (IOException e) {
            System.err.println("Error while saving captcha image.");
            e.printStackTrace();
        }
    }
}
