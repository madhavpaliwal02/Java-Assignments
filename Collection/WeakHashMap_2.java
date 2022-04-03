import java.util.WeakHashMap;

public class WeakHashMap_2 {
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

        // Accessing
        // Getting values of selected key
        System.out.println(wmap.get(27));
        System.out.println(wmap.getOrDefault(26, "CHutiya"));
        // printing map details
        System.out.println(wmap.keySet());       // only key
        System.out.println(wmap.values());       // only values
        System.out.println(wmap.entrySet());     // key-value pair
        // Printing
        System.out.println(wmap2);
        System.out.println(wmap.entrySet());


        // Other Methods
        // compute : updating value with some Arithmetic operation
        // wmap.compute(27, );
        // checking size
        System.out.println(wmap.size());
        // checking whether it is empty or not
        System.out.println(wmap2.isEmpty());
        // Clear everything
        wmap.clear();
    }
}
