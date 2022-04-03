import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_1 {
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


        /** Removing */
        System.out.println("\nRemoving");
        // remove()
        System.out.println("Removing Lion from animals2: " + animals2.remove("Lion"));
        // removeAll() - animals - animals2
//        System.out.println("Removing animals2 from animals: " + animals.removeAll(animals2));

        
        /** Type-2 -> Navigation Operation */

        /** Sub-Type - 1 */
        System.out.println("\nSub-Type - 1");
        // first()
        System.out.println("First element: " + animals.first());
        // last()
        System.out.println("Last element: " + animals.last());

        /** Sub-Type - 2 */
        System.out.println("\nSub-Type - 2");
        // Using higher()
        System.out.println("Using higher(): " + animals.higher("Lion"));
        // Using lower()
        System.out.println("Using lower(): " + animals.lower("Lion"));
        // Using ceiling()
        System.out.println("Using ceiling(): " + animals.ceiling("Lion"));
        // Using floor()
        System.out.println("Using floor(): " + animals.floor("Lion"));

        /** Sub-Type - 3 */
        System.out.println("\nSub-Type - 3");
        // pollFirst()
        System.out.println("Poll first: " + animals.first());
        // pollLast()
        System.out.println("Poll last: " + animals.last());

        /** Sub-Type - 4 */
        System.out.println("\nSub-Type - 4");
        // headSet()
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
