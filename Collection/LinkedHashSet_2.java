import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSet_2 {
    public static void main(String[] args) {

        /** Type-1 -> Operations */

        /** Creating */
        // By the object of class
        LinkedHashSet<String> name = new LinkedHashSet<>(10);
        LinkedHashSet<String> name2 = new LinkedHashSet<>();

        // By Other Collections - Array list
        ArrayList<String> al = new ArrayList<>();
        al.add("Kashish Ahuja");
        al.add("Palak Porwal");
        LinkedHashSet<String> name3 = new LinkedHashSet<>(al);


        /** Inserting */
        // add()
        name.add("Avanti Gupta");
        name.add("Drakshi Chopra");
        System.out.println("Adding elements to name using add(): " + name);
        name2.add("Chirag Sharma");
        name2.add("Tanishq Sisodiya");
        name2.add("Madhav Paliwal");
        System.out.println("Adding elements to name2 using add(): " + name2);
        // addAll()
        name.addAll(name2);
        System.out.println("Adding name2 to name using addAll(): " + name);


        /** Type-2 -> Operations */

        /** Union of Sets */
        // addAll()
        name3.addAll(name);
        System.out.println("Union of set: name3 + name: " + name3);

        /** Intersection of Sets */
        // retainAll()
        name2.retainAll(name);
        System.out.println("Intersection of set: name2 n name" + name2);

        /** Difference of Sets */
        // removeAll()
        name2.removeAll(name);
        System.out.println("Difference of set: name2 - name: " + name2);

        /** Subset */
        // containsAll()
        System.out.println("Checking the existence of elements" + name3.containsAll(name2));


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
