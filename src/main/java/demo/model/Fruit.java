package demo.model;

public class Fruit extends Item {

    public Fruit(Float weight) {
        super(weight);
    }

    @Override
    public float getWeight() {
        return weight - 0.2f;
    }

    @Override
    public String toString() {
        return "Fruit{" + getWeight() + "}";
    }
}
