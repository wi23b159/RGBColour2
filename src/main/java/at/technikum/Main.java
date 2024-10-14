package at.technikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ColourTool colorTool = new ColourTool();

        // Scanner für die Eingabe vom Benutzer
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Farbe ein (red, green, blue, orange, yellow, purple): ");
        String inputColor = scanner.nextLine(); // Benutzerinput abfragen

        // Eingabe verarbeiten
        colorTool.processInput(inputColor);

        // Scanner schließen
        scanner.close();
    }
}
