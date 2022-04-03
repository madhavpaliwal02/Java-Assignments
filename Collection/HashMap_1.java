import java.util.HashMap;

public class HashMap_1 {
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


        // Checking whether key/value is present or not
        System.out.println(map.containsKey(27));
        // case sensitive
        System.out.println(map.containsValue("Madhav Paliwal"));

        // Printing
        System.out.println(map2);
        System.out.println(map.entrySet());

    }
}
