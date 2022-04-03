import java.util.LinkedHashMap;

public class LinkedHashMap_1 {
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

        // Checking whether key/value is present or not
        System.out.println(lmap.containsKey(27));
        // case sensitive
        System.out.println(lmap.containsValue("Madhav Paliwal"));


        // Replacing values
        // Replace simple
        lmap2.replace(16, "DC");
        // Replace with condition
        lmap2.replace(27,"Madhav Paliwal", "Madhav");
        System.out.println(lmap2);


        // Removing methods
        // Remove simply
        lmap2.remove(27);
        // Remove with condition
        lmap2.remove(16, "Drakshi");

        // Printing
        System.out.println(lmap2);
        System.out.println(lmap.entrySet());
    }
}
