package Java_Ad.Collection;

import java.util.TreeMap;

public class TreeMap_3 {
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

        // Accessing Elements -2
        // Using get()
        int value1 = numbers.get("Two");
        System.out.println("Using get(): " + value1);
        // Using getOrDefault()
        int value2 = numbers.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);


        // Navigation - 4
        TreeMap<String, Integer> myNum = new TreeMap<>();
        myNum.put("First", 1);
        myNum.put("Second", 2);
        myNum.put("Third", 3);
        myNum.put("Fourth", 4);

        // Using headMap
        System.out.println("\nUsing headMap() Method:");
        // Using headMap() with default booleanValue
        System.out.println("Without boolean value: " + myNum.headMap("Fourth"));
        // Using headMap() with specified booleanValue
        System.out.println("With boolean value: " + myNum.headMap("Fourth", true));

        // Using tailMap
        System.out.println("\nUsing tailMap() Method:");
        // Using tailMap() with default booleanValue
        System.out.println("Without boolean value: " + myNum.tailMap("Second"));
        // Using tailMap() with specified booleanValue
        System.out.println("With boolean value: " + myNum.tailMap("Second", false));

        // Using subMap
        System.out.println("\nUsing subMap() Method:");
        // Using subMap() with default booleanValue
        System.out.println("Without boolean value: " + myNum.subMap("Fourth", "Third"));

        // Using subMap() with specified booleanValue
        System.out.println("With boolean value: " + myNum.subMap("Fourth", false, "Third", true));




        // Printing Tree Map
        System.out.println("TreeMap of even numbers: " + evenNumbers);
        System.out.println("TreeMap of numbers: " + numbers);
    }
}
