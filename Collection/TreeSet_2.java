import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_2 {
    public static void main(String[] args) {

        /** Type-1 -> Operations */

        /** Creating Sorted Set */
        TreeSet<String> animals = new TreeSet<>();
        TreeSet<String> animals2 = new TreeSet<>();

        /** Adding */
        // add()
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Wolf");
        animals.add("Zebra");
        animals.add("Rhino");
        // addAll()
        animals2.add("Gorilla");
        animals2.add("Shark");
        animals2.add("Eagle");
        animals2.addAll(animals);

        /** Accessing */
        Iterator<String> iter = animals.iterator();
        System.out.print("Animals: ");
        while(iter.hasNext()){
            System.out.print(iter.next() + ", ");
        }


        /** Type-3 -> Set Operations */

        /** Union of Sets */
        System.out.println("\nType-3 -> Set Operations");
        // addAll()
        animals.addAll(animals);
        System.out.println("Union of set: animals + animals: " + animals);

        /** Intersection of Sets */
        // retainAll()
        animals2.retainAll(animals);
        System.out.println("Intersection of set: animals2 n animals: " + animals2);

        /** Difference of Sets */
        // removeAll()
        animals.removeAll(animals2);
        System.out.println("Difference of set: animals - animals2: " + animals);

        /** Subset */
        // containsAll()
        System.out.println("Checking the existence of elements: " + animals.containsAll(animals2));

    }
}
