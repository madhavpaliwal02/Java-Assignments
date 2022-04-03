package Java_Ad.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_2 {
    public static void main(String[] args) {
        HashSet<String> name = new HashSet<>(10);

        name.add("Avanti Gupta");
        name.add("Drakshi Chopra");
        name.add("Palak Porwal");

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



        /** Type-3 -> Operations */

        // clone()
        name.clone();

        // contains()
        System.out.println("Checking the existence of elements: " + name.contains("Madhav Paliwal"));

        // isEmpty()
        System.out.println(name2.isEmpty());

        // size()
        System.out.println(name.size());

        // clear()
        name2.clear();
    }
}
