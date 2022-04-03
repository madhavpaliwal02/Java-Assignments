import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_1 {

    public static void main(String[] args) {
        /** Type-1 -> Operations */

        /** Creating Sorted Set */
        NavigableSet<String> animals = new TreeSet<>();

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
            System.out.print(iter.next() + ", ");
        }


        /** Type-2 -> Operation */

        // headSet()
        System.out.println();
        System.out.println("Head Set: " + animals.headSet("Wolf"));
        System.out.println("Head Set + boolean: " + animals.headSet("Wolf", true));

        // tailSet()
        System.out.println();
        System.out.println("Tail Set: " + animals.tailSet("Rhino"));
        System.out.println("Tail Set + boolean: " + animals.tailSet("Rhino", false));

        // subSet()
        System.out.println();
        System.out.println("Subset (Default): " + animals.subSet("Lion", "Zebra"));
        System.out.println("Subset + F T: " + animals.subSet("Lion", false, "Zebra", true));
        System.out.println("Subset + F F: " + animals.subSet("Lion", false, "Zebra", false));
        System.out.println("Subset + T T: " + animals.subSet("Lion", true, "Zebra", true));
    }
}