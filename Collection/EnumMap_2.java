import java.util.EnumMap;

public class EnumMap_2 {
    enum Size1 {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {
        EnumMap<Size1, Integer> obj = new EnumMap<>(Size1.class);
        obj.put(Size1.SMALL, 28);
        obj.put(Size1.MEDIUM, 32);

        EnumMap<Size1, Integer> obj2 = new EnumMap<>(Size1.class);
        obj2.putAll(obj);
        obj2.put(Size1.LARGE, 36);
        obj2.put(Size1.EXTRALARGE, 40);

        // Replacing values
        // Replace simple
        obj2.replace(Size1.SMALL, 26);
        // Replace with condition
        obj2.replace(Size1.MEDIUM,32,30);
        System.out.println(obj2);

        // Other Methods
        EnumMap<Size1, Integer> obj3 = obj2.clone();         // clone
//        System.out.println(obj3.Size());                    // Size1
        System.out.println(obj3.containsKey(Size1.SMALL));   // containesKey
        System.out.println(obj.containsValue(28));          // containsValue

        // Printing
        System.out.println(obj2);
        System.out.println(obj.entrySet());
    }
}
