import java.util.LinkedHashMap;

public class LinkedHashMap_2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lmap = new LinkedHashMap<>();
        LinkedHashMap<Integer, String> lmap2 = new LinkedHashMap<>(lmap);

        // Adding methods
        // Type-1
        lmap.put(8, "Avanti Gupta");
        lmap.put(11, "Chirag Sharma");
        lmap2.put(16, "Drakshi Chopra");
        lmap2.put(27,"Madhav Paliwal");
        // Type-2
        lmap.putIfAbsent(27,"Madhav Paliwal");
        // Type-3
        lmap.putAll(lmap2);

        // Accessing
        // Getting values of selected key
        System.out.println(lmap.get(27));
        System.out.println(lmap.getOrDefault(26, "CHutiya"));
        // printing map details
        System.out.println(lmap.keySet());       // only key
        System.out.println(lmap.values());       // only values
        System.out.println(lmap.entrySet());     // key-value pair
        // Printing
        System.out.println(lmap2);
        System.out.println(lmap.entrySet());


        // Other Methods
        // creates a copy
        lmap.clone();
        // compute : updating value with some Arithmetic operation
        // lmap.compute(27, );
        // checking size
        System.out.println(lmap.size());
        // checking whether it is empty or not
        System.out.println(lmap2.isEmpty());
        // Clear everything
        lmap.clear();
    }
}
