import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {

        // Creating TreeMap of even numbers
        TreeMap<String, Integer> evenNumbers = new TreeMap<>();
        //Creating TreeMap of numbers
        TreeMap<String, Integer> numbers = new TreeMap<>();
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
        System.out.println("TreeMap using replace: " + numbers);
        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("TreeMap using replaceAll: " + numbers);

        // Printing Tree Map
        System.out.println("TreeMap of even numbers: " + evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);
    }
}
