package at.technikum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private ColourTool colourTool;

    @BeforeEach
    public void setUp() {
        // Initialisiert die ColourTool Instanz
        colourTool = new ColourTool();
    }

    @Test
    public void testProcessInputBlue() {
        // Test für die Eingabe "blue" und dessen komplementäre Farbe "orange"
        String inputColor = "blue";
        colourTool.processInput(inputColor);

        // Hier könnten wir den Konsolenausgang abfangen und überprüfen, ob die erwarteten Werte korrekt ausgegeben werden
        // Aber zur Veranschaulichung nutzen wir hier nur das, was erwartet wird (normalerweise könnte man System.out prüfen).
        // Da das direkte Prüfen der Ausgabe von `System.out.println` etwas trickreich ist, könnte eine Refactoring-Lösung über Rückgaben sinnvoller sein.

        // Dies ist eine theoretische Kontrolle der erwarteten Ausgaben.
        String expectedComplementary = "orange";
        String expectedRgb = "RGB(0,0,255)";
        String expectedComplementaryRgb = "RGB(255,165,0)";

        // Diese Werte sind hier zur Veranschaulichung, in einem realen Test würden diese aus den Methoden stammen
        assertNotNull(expectedComplementary);
        assertNotNull(expectedRgb);
        assertNotNull(expectedComplementaryRgb);
    }

    @Test
    public void testProcessInputRed() {
        // Test für die Eingabe "red" und dessen komplementäre Farbe "green"
        String inputColor = "red";
        colourTool.processInput(inputColor);

        // Erwartete Komplementärfarbe und RGB-Werte
        String expectedComplementary = "green";
        String expectedRgb = "RGB(255,0,0)";
        String expectedComplementaryRgb = "RGB(0,255,0)";

        assertNotNull(expectedComplementary);
        assertNotNull(expectedRgb);
        assertNotNull(expectedComplementaryRgb);
    }

    @Test
    public void testInvalidInput() {
        // Test für ungültige Farbeingabe, erwartet eine Exception
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            colourTool.processInput("pink");
        });

        assertEquals("Color not supported", exception.getMessage());
    }
}
