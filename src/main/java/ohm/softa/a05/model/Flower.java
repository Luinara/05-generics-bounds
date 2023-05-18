package ohm.softa.a05.model;

public class Flower extends Plant {
    private final PlantColor Color;
    public Flower(String family, String name, double height, PlantColor color) {
        super(height, family, name);

        if (color == PlantColor.GREEN) {
            throw new java.lang.IllegalArgumentException();
        }
        Color = color;
    }

    @Override
    public PlantColor getColor() {
        return Color;
    }

}
