package java.stringUtility;

import java.stringUtility.StringUtility;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

class ReverseStringTest {

    @org.junit.jupiter.api.Test
    void helloMustGiveOllehReversedWithLowercase() {
        // Arrange
        String text = "hello";
        // Act
        String result = StringUtility.reverseString(text);
        // Assert
        Assert.assertEquals("olleh", result);
    }

    @org.junit.jupiter.api.Test
    void helloMustGiveOllehReversedWithUppercase() {
        // Arrange
        String text = "HELLO";
        // Act
        String result = StringUtility.reverseString(text);
        // Assert
        Assert.assertEquals("OLLEH", result);
    }

    @org.junit.jupiter.api.Test
    void helloMustGiveOllehReversedWithDifferentCase() {
        // Arrange
        String text = "HeLlO";
        // Act
        String result = StringUtility.reverseString(text);
        // Assert
        Assert.assertEquals("OlLeH", result);
    }

    @org.junit.jupiter.api.Test
    void emptyStringMustGiveEmptyString() {
        // Arrange
        String text = "";
        // Act
        String result = StringUtility.reverseString(text);
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
            StringUtility.reverseString(text);
        });
    }
}