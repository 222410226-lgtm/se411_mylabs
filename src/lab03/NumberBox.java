package lab03;

public class NumberBox<T extends Number> {

    private T item;

    // Store an item of type T in the wrapper
    public void setItem(T item) {
        this.item = item;
    }

    // Retrieve the stored item
    public T getItem() {
        return item;
    }

    // Takes another number as an argument and calculates the sum
    public double add(Number other) {
        return this.item.doubleValue() + other.doubleValue();
    }
}