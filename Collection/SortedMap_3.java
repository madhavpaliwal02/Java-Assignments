import java.util.*;
import java.util.TreeMap;

public class SortedMap_3 {
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

        // Accessing Elements -1
        // Using entrySet()
        System.out.println("Key/Value mappings: " + numbers.entrySet());
        // Using keySet()
        System.out.println("Keys: " + numbers.keySet());
        // Using values()
        System.out.println("Values: " + numbers.values());

        // Accessing Elements -2
        // Using get()
        int value1 = numbers.get("Three");
        System.out.println("Using get(): " + value1);
        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);
        
        // Printing Tree Map
        System.out.println("SortedMap of even numbers: " + evenNumbers);
        System.out.println("SortedMap of numbers: " + numbers);
    }
}
