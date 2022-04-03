import java.util.EnumMap;

public class EnumMap_1 {
    
    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }
    
    public static void main(String[] args) {
        EnumMap<Size, Integer> obj = new EnumMap<>(Size.class);
        obj.put(Size.SMALL, 28);
        obj.put(Size.MEDIUM, 32);

        EnumMap<Size, Integer> obj2 = new EnumMap<>(Size.class);
        obj2.putAll(obj);
        obj2.put(Size.LARGE, 36);
        obj2.put(Size.EXTRALARGE, 40);

        // Accessing
        // Getting values of selected key
        System.out.println(obj2.get(Size.LARGE));
        // printing map details
        System.out.println(obj2.keySet());       // only key
        System.out.println(obj2.values());       // only values
        System.out.println(obj2.entrySet());     // key-value pair

        // Removing methods
        // Remove simply
        obj2.remove(Size.MEDIUM);
        // Remove with condition
        obj2.remove(Size.EXTRALARGE, 40);

        // Printing
        System.out.println(obj2);
        System.out.println(obj.entrySet());
    }
}
