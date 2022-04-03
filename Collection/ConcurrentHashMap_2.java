import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMap_2 {
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

        // Bulk ConcurrentHashMap Operations
        // 1. forEach()
        // forEach() without Transformer function
        obj2.forEach(4, (k,v) -> System.out.println("Key: " + k + "Value: " + v));
        // forEach() with Transformer function
        obj2.forEach(4, (k,v) -> v,(v) -> System.out.println(v + ", "));
        // Variations in forEach()
        // a. forEachEntry()    b. forEachKey()   c. forEachValues()

        // 2. search()
        String key = obj2.search(4, (k,v) -> {return v==3 ? k: null;});
        System.out.println(key);
        // Variations in search()
        // a. searchEntries()    b. searchKeys()   c. searchValues()

        // 3. reduce()
        int sum = obj2.reduce(4, (k,v) -> v, (v1, v2) -> v1+v2 );
        System.out.println("Sum: " + sum);
        // Variations in reduce()
        // a. reduceEntries()    b. reduceKeys()   c. reduceValues()


        // Printing Tree Map
        System.out.println("ConcurrentHashMap of even numbers: " + obj);
        System.out.println("ConcurrentHashMap of obj2: " + obj2);
    }
}
