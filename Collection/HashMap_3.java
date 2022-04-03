import java.util.HashMap;

public class HashMap_3 {
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

        // Replacing values
        // Replace simple
        map2.replace(16, "DC");
        // Replace with condition
        map2.replace(27,"Madhav Paliwal", "Madhav");
        System.out.println(map2);

        // Other Methods
        // creates a copy
        map.clone();
        // compute : updating value with some Arithmetic operation
        // map.compute(27, );
        // checking size
        System.out.println(map.size());
        // checking whether it is empty or not
        System.out.println(map2.isEmpty());
        // Clear everything
        map.clear();
    }
}
