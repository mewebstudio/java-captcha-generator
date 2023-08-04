## Captcha Generator

[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT) [![Maven badge](https://maven-badges.herokuapp.com/maven-central/com.mewebstudio/captcha/badge.svg?style=flat)](https://central.sonatype.com/artifact/com.mewebstudio/captcha)

The `Captcha Generator` is a utility for generating captcha images with customizable configurations. Captchas are commonly used to prevent automated bots from accessing or submitting data on web forms. This class provides the functionality to generate captcha images with random codes, random fonts, and noise to increase security and make it challenging for bots to decipher.

### Installation
#### for maven users
Add the following dependency to your `pom.xml` file:
```xml
<dependency>
  <groupId>com.mewebstudio</groupId>
  <artifactId>captcha</artifactId>
  <version>0.1.3</version>
</dependency>
```
#### for gradle users
Add the following dependency to your `build.gradle` file:
```groovy
implementation 'com.mewebstudio:captcha:0.1.3'
```

### How to Use

To use the `Captcha` class to generate captcha images, follow these steps:

1. **Instantiate the Captcha:**

   You can create an instance of the `Captcha` class with or without a custom configuration. If you want to use the default configuration, create an instance without any arguments:

   ```java
   Captcha captcha = new Captcha();
   ```

   If you want to use a custom configuration, create a `Config` instance and pass it as an argument to the constructor:

   ```java
   Config customConfig = new Config();
   // Customize the configuration properties as needed
   customConfig.setFonts(new String[]{
      "src/main/resources/fonts/Roboto-Regular.ttf",
      "src/main/resources/fonts/OpenSans-Regular.ttf",
      "src/main/resources/fonts/Lato-Regular.ttf"
   });
   customConfig.setDark(true);
   Captcha captcha = new Captcha(customConfig);
   ```

   or

   ```java
   captcha.getConfig().setFonts(new String[]{
       "src/main/resources/fonts/Roboto-Regular.ttf",
       "src/main/resources/fonts/OpenSans-Regular.ttf",
       "src/main/resources/fonts/Lato-Regular.ttf"
   });
   captcha.getConfig().setDark(true);
   ```

2. **Generate a Captcha:**

   To generate a captcha image, call the `generate()` method on the `Captcha` instance:

   ```java
   GeneratedCaptcha generatedCaptcha = captcha.generate();
   BufferedImage captchaImage = generatedCaptcha.getImage();
   String captchaCode = generatedCaptcha.getCode();
   ```

   The `generate()` method returns a `GeneratedCaptcha` object containing the captcha image (`BufferedImage`) and the corresponding captcha code (`String`).

3. **Display the Captcha:**

   You can use the generated captcha image in your application to display it to users. For example, in a web application, you can embed the image in an HTML page.

4. **Verify the Captcha Response:**

   When the user submits the form or action that contains the captcha, you need to verify the user's response with the captcha code. Compare the captcha code entered by the user with the actual captcha code to validate whether the user is human:

   ```java
   String userEnteredCode = "ABC123"; // Replace this with the user's entered captcha code
   if (userEnteredCode.equals(captchaCode)) {
       // Captcha code matches, user is verified
       // Proceed with the desired action
   } else {
       // Captcha code does not match, display an error message or take appropriate action
   }
   ```

### Customization

The `Captcha` class allows you to customize various aspects of the generated captcha images through the `Config` class:

- **Width and Height:** Set the dimensions of the captcha image using `config.setWidth(int width)` and `config.setHeight(int height)`.

- **Code Length:** Adjust the length of the captcha code with `config.setLength(int length)`.

- **Noise:** Add noise to the captcha image to make it more challenging for bots to interpret. You can control the noise level with `config.setNoise(int noise)`.

- **Dark or Light Mode:** Choose between dark or light mode for the captcha image. Set the mode with `config.setDark(boolean dark)`.

- **Font Styles and Fonts:** Customize the font styles and fonts used in the captcha image. You can set custom font files using `config.setFonts(String[] fonts)`.

- **Color Palette:** Define the color palette for the captcha image in both dark and light modes. Adjust the palettes with `config.setLightPalette(Color[] palettes)` and `config.setDarkPalette(Color[] palette)`.

- **Background Color:** Set the background color of the captcha image for both dark and light modes. Use `config.setLightBackgroundColor(Color color)` and `config.setDarkBackgroundColor(Color color)`.

### Exception Handling

The `Captcha` class may throw a `FontLoadException` if it fails to load custom fonts specified in the configuration. Handle this exception appropriately to handle font loading failures.

### Dependencies

The `Captcha` class does not have any external dependencies other than standard Java libraries.

### Example

Here's a basic example of how to use the `Captcha` class to generate and display a captcha image in a Java application:

```java
public class CaptchaExample {
    public static void main(String[] args) {
        // Create a new Captcha instance
        Captcha captcha = new Captcha();
        captcha.getConfig().setDark(true);

        // Generate a captcha image
        GeneratedCaptcha generatedCaptcha = captcha.generate();
        BufferedImage captchaImage = generatedCaptcha.getImage();
        String captchaCode = generatedCaptcha.getCode();

        // Display the captcha code and image (In a real application, you would display the image in a GUI or web page)
        System.out.println("Captcha Code: " + captchaCode);
        System.out.println("Captcha Image: " + captchaImage);

        // In a real application, you would provide the captcha image to users for validation
        // Users will enter the captcha code, and you can verify it with the generated captcha code.
    }
}
```

This is a basic overview of the `Captcha Generator`

License - MIT
