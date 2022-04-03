import java.util.WeakHashMap;

public class WeakHashMap_1 {
    public static void main(String[] args) {
        WeakHashMap<Integer, String> wmap = new WeakHashMap<>();
        WeakHashMap<Integer, String> wmap2 = new WeakHashMap<>(wmap);

        // Adding methods
        // Type-1
        wmap.put(8, "Avanti Gupta");
        wmap.put(11, "Chirag Sharma");
        wmap2.put(16, "Drakshi Chopra");
        wmap2.put(27,"Madhav Paliwal");
        // Type-2
        wmap.putIfAbsent(27,"Madhav Paliwal");
        // Type-3
        wmap.putAll(wmap2);

        // Checking whether key/value is present or not
        System.out.println(wmap.containsKey(27));
        // case sensitive
        System.out.println(wmap.containsValue("Madhav Paliwal"));


        // Replacing values
        // Replace simple
        wmap2.replace(16, "DC");
        // Replace with condition
        wmap2.replace(27,"Madhav Paliwal", "Madhav");
        System.out.println(wmap2);


        // Removing methods
        // Remove simply
        wmap2.remove(27);
        // Remove with condition
        wmap2.remove(16, "Drakshi");

        // Printing
        System.out.println(wmap2);
        System.out.println(wmap.entrySet());
    }
}
