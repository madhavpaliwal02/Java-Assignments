import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_1 {
    public static void main(String[] args) {

        // Creating ConcurrentHashMap of even numbers
        ConcurrentHashMap<String, Integer> obj = new ConcurrentHashMap<>();
        //Creating ConcurrentHashMap of numbers
        ConcurrentHashMap<String, Integer> obj2 = new ConcurrentHashMap<>();
        obj2.put("One", 1);


        // Adding Methods
        // Using put()
        obj.put("Two", 2);
        obj.put("Four", 4);
        // Using putIfAbsent()
        obj.putIfAbsent("Six", 6);
        // Using putAll()
        obj2.putAll(obj);


        // Accessing Elements -1
        // Using entrySet()
        System.out.println("Key/Value mappings: " + obj2.entrySet());
        // Using keySet()
        System.out.println("Keys: " + obj2.keySet());
        // Using values()
        System.out.println("Values: " + obj2.values());

        // Accessing Elements -2
        // Using get()
        int value1 = obj2.get("Three");
        System.out.println("Using get(): " + value1);
        // Using getOrDefault()
        int value2 = obj2.getOrDefault("Five", 5);
        System.out.println("Using getOrDefault(): " + value2);


        // Removing
        // remove method with single parameter
        int value = obj2.remove("Two");
        System.out.println("Removed value: " + value);
        // remove method with two parameters - conditional
        boolean result = obj2.remove("Three", 3);
        System.out.println("Is the entry {Three=3} removed? " + result);


        // Printing Tree Map
        System.out.println("ConcurrentHashMap of even numbers: " + obj);
        System.out.println("ConcurrentHashMap of obj2: " + obj2);
    }
}
