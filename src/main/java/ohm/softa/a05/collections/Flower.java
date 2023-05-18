package ohm.softa.a05.collections;

public class Flower extends Plant{
    PlantColor Color;

    @Override
    public PlantColor getColor() {
        return null;
    }

    @Override
    public int compareTo(Plant o) {
        return Double.compare(this.height, o.height);
    }


}
