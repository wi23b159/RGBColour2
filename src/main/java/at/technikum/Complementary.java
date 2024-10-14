package at.technikum;

public class Complementary {
    public String getComplementaryColor(String color) {
        switch (color.toLowerCase()) {
            case "red":
                return "green";
            case "green":
                return "red";
            case "blue":
                return "orange";
            case "orange":
                return "blue";
            case "yellow":
                return "purple";
            case "purple":
                return "yellow";
            default:
                throw new IllegalArgumentException("Color not supported");
        }
    }
}