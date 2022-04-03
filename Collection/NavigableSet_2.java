import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_2 {
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

        /** Type-2 -> Navigation Operation */

        System.out.println();
        // Using higher()
        System.out.println("Using higher(): " + animals.higher("Lion"));

        // Using lower()
        System.out.println("Using lower(): " + animals.lower("Lion"));

        // Using ceiling()
        System.out.println("Using ceiling(): " + animals.ceiling("Lion"));

        // Using floor()
        System.out.println("Using floor(): " + animals.floor("Lion"));

        // pollFirst()
        System.out.println("Poll first: " + animals.first());

        // pollLast()
        System.out.println("Poll last: " + animals.last());
    }
}
