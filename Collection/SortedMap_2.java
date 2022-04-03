import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_2 {
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


        // Replacing
        // Using replace()
        numbers.replace("Second", 22);  // Unconditional
        numbers.replace("Third", 3, 33);    // Conditional
        System.out.println("SortedMap using replace: " + numbers);
        // Using replaceAll()
        numbers.replaceAll((key, oldValue) -> oldValue + 2);
        System.out.println("SortedMap using replaceAll: " + numbers);


        // Printing Tree Map
        System.out.println("SortedMap of even numbers: " + evenNumbers);
        System.out.println("SortedMap of numbers: " + numbers);
    }
}
