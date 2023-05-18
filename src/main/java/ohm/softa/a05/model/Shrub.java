package ohm.softa.a05.model;

public class Shrub extends Plant {
    public Shrub(String family, String name, double height) {
        super(height, family, name);
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }
}
