package at.technikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RgbServiceTest {

    private RgbService rgbService;

    @BeforeEach
    public void setUp() {
        // Initialisiert die RgbService-Instanz vor jedem Test
        rgbService = new RgbService();
    }

    @Test
    public void testGetRgbValueRed() {
        // Testet die Eingabe "red" und erwartet den RGB-Wert "RGB(255,0,0)"
        String inputColor = "red";
        String expectedRgbValue = "RGB(255,0,0)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testGetRgbValueGreen() {
        // Testet die Eingabe "green" und erwartet den RGB-Wert "RGB(0,255,0)"
        String inputColor = "green";
        String expectedRgbValue = "RGB(0,255,0)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testGetRgbValueBlue() {
        // Testet die Eingabe "blue" und erwartet den RGB-Wert "RGB(0,0,255)"
        String inputColor = "blue";
        String expectedRgbValue = "RGB(0,0,255)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testGetRgbValueOrange() {
        // Testet die Eingabe "orange" und erwartet den RGB-Wert "RGB(255,165,0)"
        String inputColor = "orange";
        String expectedRgbValue = "RGB(255,165,0)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testGetRgbValueYellow() {
        // Testet die Eingabe "yellow" und erwartet den RGB-Wert "RGB(255,255,0)"
        String inputColor = "yellow";
        String expectedRgbValue = "RGB(255,255,0)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testGetRgbValuePurple() {
        // Testet die Eingabe "purple" und erwartet den RGB-Wert "RGB(128,0,128)"
        String inputColor = "purple";
        String expectedRgbValue = "RGB(128,0,128)";

        String result = rgbService.getRgbValue(inputColor);
        assertEquals(expectedRgbValue, result);
    }

    @Test
    public void testInvalidInput() {
        // Testet eine ungültige Eingabe und erwartet eine IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            rgbService.getRgbValue("pink");
        });

        // Prüft, ob die Exception die richtige Fehlermeldung hat
        assertEquals("Color not supported", exception.getMessage());
    }
}
