import java.util.Iterator;
import java.util.TreeSet;

public class SortedSet {
    public static void main(String[] args) {

        /** Type-1 -> Operations */

        /** Creating Sorted Set */
        java.util.SortedSet<String> animals = new TreeSet<>();

        /** Adding */
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Wolf");
        animals.add("Zebra");
        animals.add("Rhino");

        /** Accessing */
        Iterator<String> iter = animals.iterator();
        System.out.println("Name: ");
        while(iter.hasNext()){
            System.out.println(iter.next() + ", ");
        }


        /** Type-2 -> Operation */

        // first()
        System.out.println("First element: " + animals.first());

        // last()
        System.out.println("Last element: " + animals.last());

        // headSet()
        System.out.println("Head Set: " + animals.headSet("Wolf"));

        // tailSet()
        System.out.println("Tail Set: " + animals.tailSet("Rhino"));

        // subSet()
        System.out.println("Subset: " + animals.subSet("Lion", "Zebra"));
    }
}
