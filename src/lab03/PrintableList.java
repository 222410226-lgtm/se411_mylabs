package lab03;

import java.util.Arrays;
import java.util.List;

public class PrintableList<T> {

    private List<T> list;

    // Constructor: accepts an array of items and stores them into the list attribute
    public PrintableList(T[] items) {
        this.list = Arrays.asList(items);
    }

    // Returns the list
    public List<T> getList() {
        return list;
    }

    // Prints all the items of the list
    public void printAll() {
        for (T item : list) {
            System.out.println(item);
        }
    }
}