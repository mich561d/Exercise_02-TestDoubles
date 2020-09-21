package java.stringUtility;

import java.stringUtility.StringUtility;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

class LowercaseString {

    @org.junit.jupiter.api.Test
    void helloMustGiveHello() {
        // Arrange
        String text = "hello";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("hello", result);
    }

    @org.junit.jupiter.api.Test
    void HELLOMustGiveHello() {
        // Arrange
        String text = "HELLO";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("hello", result);
    }

    @org.junit.jupiter.api.Test
    void HeLlOMustGiveHello() {
        // Arrange
        String text = "HeLlO";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("hello", result);
    }

    @org.junit.jupiter.api.Test
    void Number42MustGive42() {
        // Arrange
        String text = "42";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("42", result);
    }

    @org.junit.jupiter.api.Test
    void characterSlashMustGiveSlash() {
        // Arrange
        String text = "/";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("/", result);
    }

    @org.junit.jupiter.api.Test
    void emptyStringMustGiveEmptyString() {
        // Arrange
        String text = "";
        // Act
        String result = StringUtility.lowercaseString(text);
        // Assert
        Assert.assertEquals("", result);
    }

    @org.junit.jupiter.api.Test
    void nullMustThrowIllegalArgumentException() {
        // Arrange
        String text = null;
        // Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            // Act
            StringUtility.lowercaseString(text);
        });
    }
}