package at.technikum;

public class ColourTool {
    private Complementary complementaryService = new Complementary();
    private RgbService rgbService = new RgbService();

    public void processInput(String color) {
        String complementaryColor = complementaryService.getComplementaryColor(color);
        String rgbValue = rgbService.getRgbValue(color);
        String complementaryRgbValue = rgbService.getRgbValue(complementaryColor);

        System.out.println("Input color: " + color);
        System.out.println("Complementary color: " + complementaryColor);
        System.out.println("RGB values: " + color + " " + rgbValue + ", " + complementaryColor + " " + complementaryRgbValue);
    }
}