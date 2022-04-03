import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMap_2 {
    public static void main(String[] args) {

        // Creating NavigableMap of even numbers
        NavigableMap<String, Integer> evenNumbers = new TreeMap<>();
        //Creating NavigableMap of numbers
        NavigableMap<String, Integer> myNum = new TreeMap<>();
        myNum.put("One", 1);


        // Adding Methods
        // Using put()
        evenNumbers.put("Two", 2);
        evenNumbers.put("Four", 4);
        // Using putIfAbsent()
        evenNumbers.putIfAbsent("Six", 6);
        // Using putAll()
        myNum.putAll(evenNumbers);

        // Navigation - 1
        // Using the firstKey() method
        String firstKey = myNum.firstKey();
        System.out.println("First Key: " + firstKey);
        // Using the lastKey() method
        String lastKey = myNum.lastKey();
        System.out.println("Last Key: " + lastKey);
        // Using firstEntry() method
        System.out.println("First Entry: " + myNum.firstEntry());
        // Using the lastEntry() method
        System.out.println("Last Entry: " + myNum.lastEntry());

        // Navigation - 2
        // Using higher()
        System.out.println("Using higherKey(): " + myNum.higherKey("Fourth"));
        System.out.println("Using higherEntry(): " + myNum.higherEntry("Fourth"));
        // Using lower()
        System.out.println("\nUsing lowerKey(): " + myNum.lowerKey("Fourth"));
        System.out.println("Using lowerEntry(): " + myNum.lowerEntry("Fourth"));
        // Using ceiling()
        System.out.println("\nUsing ceilingKey(): " + myNum.ceilingKey("Fourth"));
        System.out.println("Using ceilingEntry(): " + myNum.ceilingEntry("Fourth"));
        // Using floor()
        System.out.println("\nUsing floorKey(): " + myNum.floorKey("Fourth"));
        System.out.println("Using floorEntry(): " + myNum.floorEntry("Fourth"));

        // Navigation - 3
        //Using the pollFirstEntry() method
        System.out.println("Using pollFirstEntry(): " + myNum.pollFirstEntry());
        // Using the pollLastEntry() method
        System.out.println("Using pollLastEntry(): " + myNum.pollLastEntry());
        System.out.println("Updated NavigableMap: " + myNum);





        // Printing Tree Map
        System.out.println("NavigableMap of even numbers: " + evenNumbers);
        System.out.println("NavigableMap of numbers: " + myNum);
    }
}
