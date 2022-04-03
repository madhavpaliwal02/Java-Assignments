import java.util.TreeSet;

public class TreeSet_3 {
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


        /** Type-4 -> Other Operations */

        System.out.println("\nType-4 -> Other Operations");
        // clone()
        animals.clone();

        // contains()
        System.out.println("Checking the existence of elements: " + animals2.contains("Gorilla"));

        // isEmpty()
        System.out.println(animals2.isEmpty());

        // size()
        System.out.println(animals.size());

        // clear()
        animals2.clear();
    }
}
