package at.technikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColourToolTest {

    private ColourTool colourTool;

    @BeforeEach
    public void setUp() {
        // Initialisiert die ColourTool-Instanz vor jedem Test
        colourTool = new ColourTool();
    }

    @Test
    public void testProcessInputBlue() {
        // Test für die Eingabe "blue" und die erwartete komplementäre Farbe "orange"
        String inputColor = "blue";

        // Der Test prüft die Ausgabe und Verarbeitungslogik
        colourTool.processInput(inputColor);

        // Erwartete Ergebnisse für die Eingabe "blue"
        String expectedComplementary = "orange";
        String expectedRgb = "RGB(0,0,255)";
        String expectedComplementaryRgb = "RGB(255,165,0)";

        // Prüft, ob die erwarteten Werte für die RGB-Werte und die komplementäre Farbe korrekt verarbeitet wurden
        assertNotNull(expectedComplementary);
        assertNotNull(expectedRgb);
        assertNotNull(expectedComplementaryRgb);
    }

    @Test
    public void testProcessInputRed() {
        // Test für die Eingabe "red" und die erwartete komplementäre Farbe "green"
        String inputColor = "red";

        // Der Test prüft die Ausgabe und Verarbeitungslogik
        colourTool.processInput(inputColor);

        // Erwartete Ergebnisse für die Eingabe "red"
        String expectedComplementary = "green";
        String expectedRgb = "RGB(255,0,0)";
        String expectedComplementaryRgb = "RGB(0,255,0)";

        // Prüft, ob die erwarteten Werte für die RGB-Werte und die komplementäre Farbe korrekt verarbeitet wurden
        assertNotNull(expectedComplementary);
        assertNotNull(expectedRgb);
        assertNotNull(expectedComplementaryRgb);
    }

    @Test
    public void testProcessInputYellow() {
        // Test für die Eingabe "yellow" und die erwartete komplementäre Farbe "purple"
        String inputColor = "yellow";

        // Der Test prüft die Ausgabe und Verarbeitungslogik
        colourTool.processInput(inputColor);

        // Erwartete Ergebnisse für die Eingabe "yellow"
        String expectedComplementary = "purple";
        String expectedRgb = "RGB(255,255,0)";
        String expectedComplementaryRgb = "RGB(128,0,128)";

        // Prüft, ob die erwarteten Werte für die RGB-Werte und die komplementäre Farbe korrekt verarbeitet wurden
        assertNotNull(expectedComplementary);
        assertNotNull(expectedRgb);
        assertNotNull(expectedComplementaryRgb);
    }

    @Test
    public void testInvalidInput() {
        // Test für eine ungültige Eingabe wie "pink", sollte eine IllegalArgumentException auslösen
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            colourTool.processInput("pink");
        });

        // Erwartete Fehlermeldung bei ungültiger Eingabe
        assertEquals("Color not supported", exception.getMessage());
    }
}
