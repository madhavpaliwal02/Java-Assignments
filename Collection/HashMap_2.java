import java.util.HashMap;

public class HashMap_2 {
    public static void main(String[] args) {
        HashMap<Integer , String> map = new HashMap<>();
        HashMap<Integer , String> map2 = new HashMap<>();

        // Adding methods
        // Type-1
        map.put(8, "Avanti Gupta");
        map.put(11, "Chirag Sharma");
        map2.put(16, "Drakshi Chopra");
        map2.put(27,"Madhav Paliwal");
        // Type-2
        map.putIfAbsent(27,"Madhav Paliwal");
        // Type-3
        map.putAll(map2);


        // Accessing
        // Getting values of selected key
        System.out.println(map.get(27));
        System.out.println(map.getOrDefault(26, "CHutiya"));
        // printing map details
        System.out.println(map.keySet());       // only key
        System.out.println(map.values());       // only values
        System.out.println(map.entrySet());     // key-value pair
        // Printing
        System.out.println(map2);
        System.out.println(map.entrySet());

    }
}
