package demo.model;

public class Cake extends Item {

    public Cake() {
        super(0.0f);
    }

    public Cake(Float weight) {
        super(weight);
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cake{" + "weight=" + weight + '}';
    }
}
