package ohm.softa.a05.collections;

public abstract class Plant implements Comparable<Plant> {
    double height;
    String family;
    String name;

    public double getHeight() {
        return height;
    }

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public abstract PlantColor getColor();
}
