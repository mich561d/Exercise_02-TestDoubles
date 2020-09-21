package stringUtility;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

class CapitalizeString {

    @org.junit.jupiter.api.Test
    void helloMustGiveHELLO() {
        // Arrange
        String text = "hello";
        // Act
        String result = StringUtility.capitalizeString(text);
        // Assert
        Assert.assertEquals("HELLO", result);
    }

    @org.junit.jupiter.api.Test
    void HELLOMustGiveHELLO() {
        // Arrange
        String text = "HELLO";
        // Act
        String result = StringUtility.capitalizeString(text);
        // Assert
        Assert.assertEquals("HELLO", result);
    }

    @org.junit.jupiter.api.Test
    void HeLlOMustGiveHELLO() {
        // Arrange
        String text = "HeLlO";
        // Act
        String result = StringUtility.capitalizeString(text);
        // Assert
        Assert.assertEquals("HELLO", result);
    }

    @org.junit.jupiter.api.Test
    void Number42MustGive42() {
        // Arrange
        String text = "42";
        // Act
        String result = StringUtility.capitalizeString(text);
        // Assert
        Assert.assertEquals("42", result);
    }

    @org.junit.jupiter.api.Test
    void characterSlashMustGiveSlash() {
        // Arrange
        String text = "/";
        // Act
        String result = StringUtility.capitalizeString(text);
        // Assert
        Assert.assertEquals("/", result);
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
            StringUtility.capitalizeString(text);
        });
    }
}