import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_3 {
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


        // Navigation - 4
        NavigableMap<String, Integer> myNum = new TreeMap<>();
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
        System.out.println("NavigableMap of even numbers: " + evenNumbers);
        System.out.println("NavigableMap of numbers: " + numbers);
    }
}
