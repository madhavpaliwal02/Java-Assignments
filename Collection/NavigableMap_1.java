import java.util.TreeMap;
import java.util.NavigableMap;

public class NavigableMap_1 {
    public static void main(String[] args) {

        // Creating NavigableMap of even numbers
        NavigableMap<String, Integer> evenNumbers = new TreeMap<>();
        //Creating NavigableMap of numbers
        NavigableMap<String, Integer> numbers = new TreeMap<>();
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


        // Removing
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);
        // remove method with two parameters - conditional
        boolean result = numbers.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);


        // Replacing
        // Using replace()
        numbers.replace("Second", 22);  // Unconditional
        numbers.replace("Third", 3, 33);    // Conditional
        System.out.println("NavigableMap using replace: " + numbers);
        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("NavigableMap using replaceAll: " + numbers);

        // Printing Tree Map
        System.out.println("NavigableMap of even numbers: " + evenNumbers);
        System.out.println("NavigableMap of numbers: " + numbers);
    }
}
