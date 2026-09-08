package lab03;
import java.util.Arrays;
import java.util.List;

public class App {

    // Exercise 3.14: accepts a list of any type and prints each item
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    // Exercise 3.15: takes a list of Number objects and calculates the sum
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {

        // Exercise 1: PrintableList of Strings
        String[] names = { "Alice", "Bob", "Charlie" };
        PrintableList<String> stringList = new PrintableList<>(names);
        System.out.println("PrintableList<String>:");
        stringList.printAll();

        // Exercise 1: PrintableList of Integers
        Integer[] numbers = { 1, 2, 3, 4 };
        PrintableList<Integer> intList = new PrintableList<>(numbers);
        System.out.println("\nPrintableList<Integer>:");
        intList.printAll();

        // Exercise 2: NumberBox with Integer
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setItem(10);
        System.out.println("\nNumberBox<Integer> item: " + intBox.getItem());
        System.out.println("NumberBox<Integer> sum with 5: " + intBox.add(5));

        // Exercise 2: NumberBox with Double
        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setItem(3.5);
        System.out.println("\nNumberBox<Double> item: " + doubleBox.getItem());
        System.out.println("NumberBox<Double> sum with 2.5: " + doubleBox.add(2.5));

        // Exercise 3: wildcard methods
        System.out.println("\nprintList with String list:");
        printList(stringList.getList());

        System.out.println("\nprintList with Integer list:");
        printList(intList.getList());

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("\nsumNumbers result: " + sumNumbers(nums));
    }
}