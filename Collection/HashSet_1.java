import java.util.HashSet;
import java.util.Iterator;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>(10);

        name.add("Avanti Gupta");
        name.add("Drakshi Chopra");

        HashSet<String> name2 = new HashSet<>();

        /** Type-1 -> Operations */

        /** Inserting */
        // add()
        name2.add("Chirag Sharma");
        name2.add("Tanishq Sisodiya");
        name2.add("Madhav Paliwal");
        // addAll()
        name.addAll(name2);

        /** Accessing */
        Iterator<String> iter = name.iterator();
        while(iter.hasNext()){
            System.out.println("Name: " + iter.next());
        }

        /** Removing */
        // remove()
        System.out.println(name2.remove("Madhav Paliwal"));
        // removeAll()
        System.out.println(name2.removeAll(name2));

        /** Type-2 -> Operations */

        /** Union of Sets */
        // addAll()
        name2.addAll(name);

        /** Intersection of Sets */
        // retainAll()
        name2.retainAll(name);

        /** Difference of Sets */
        // removeAll()
        name.removeAll(name2);

        /** Subset */
        // containsAll()
        System.out.println(name.containsAll(name2));


    }
}
