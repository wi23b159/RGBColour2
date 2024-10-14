package at.technikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplementaryTest {

    private Complementary complementaryService;

    @BeforeEach
    public void setUp() {
        // Initialisiert die Complementary-Instanz vor jedem Test
        complementaryService = new Complementary();
    }

    @Test
    public void testGetComplementaryColorRed() {
        // Testet die Eingabe "red" und erwartet "green" als komplementäre Farbe
        String inputColor = "red";
        String expectedComplementary = "green";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testGetComplementaryColorGreen() {
        // Testet die Eingabe "green" und erwartet "red" als komplementäre Farbe
        String inputColor = "green";
        String expectedComplementary = "red";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testGetComplementaryColorBlue() {
        // Testet die Eingabe "blue" und erwartet "orange" als komplementäre Farbe
        String inputColor = "blue";
        String expectedComplementary = "orange";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testGetComplementaryColorOrange() {
        // Testet die Eingabe "orange" und erwartet "blue" als komplementäre Farbe
        String inputColor = "orange";
        String expectedComplementary = "blue";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testGetComplementaryColorYellow() {
        // Testet die Eingabe "yellow" und erwartet "purple" als komplementäre Farbe
        String inputColor = "yellow";
        String expectedComplementary = "purple";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testGetComplementaryColorPurple() {
        // Testet die Eingabe "purple" und erwartet "yellow" als komplementäre Farbe
        String inputColor = "purple";
        String expectedComplementary = "yellow";

        String result = complementaryService.getComplementaryColor(inputColor);
        assertEquals(expectedComplementary, result);
    }

    @Test
    public void testInvalidInput() {
        // Testet eine ungültige Eingabe und erwartet eine IllegalArgumentException
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            complementaryService.getComplementaryColor("pink");
        });

        // Prüft, ob die Exception die richtige Fehlermeldung hat
        assertEquals("Color not supported", exception.getMessage());
    }
}
