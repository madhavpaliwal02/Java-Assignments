import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_1 {
    public static void main(String[] args) {

        // Creating SortedMap of even numbers
        SortedMap<String, Integer> evenNumbers = new TreeMap<>();
        //Creating SortedMap of numbers
        SortedMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);


        // Adding Methods
        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        // Using putAll()
        numbers.putAll(evenNumbers);


        // Removing
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);
        // remove method with two parameters - conditional
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);


        // Printing Tree Map
        System.out.println("SortedMap of even numbers: " + evenNumbers);
        System.out.println("SortedMap of numbers: " + numbers);
    }
}
