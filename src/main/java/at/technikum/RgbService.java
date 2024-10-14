package at.technikum;

public class RgbService {
    public String getRgbValue(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return "RGB(255,0,0)";
            case "green":
                return "RGB(0,255,0)";
            case "blue":
                return "RGB(0,0,255)";
            case "orange":
                return "RGB(255,165,0)";
            case "yellow":
                return "RGB(255,255,0)";
            case "purple":
                return "RGB(128,0,128)";
            default:
                throw new IllegalArgumentException("Color not supported");
        }
    }
}
