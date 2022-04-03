import java.util.ArrayList;
import java.util.TreeSet;

public class Iterator {
    public static void main(String[] args) {

        /** Array List */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(16);
        al.add(49);
        al.add(72);
        al.add(58);

        /** Tree Set */
        TreeSet<String> animals = new TreeSet<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Wolf");
        animals.add("Zebra");
        animals.add("Rhino");


        /** Accessing */
        java.util.Iterator<String> str = animals.iterator();
        System.out.print("Animals: ");
        while(str.hasNext()){
            System.out.print(str.next() + ", ");
        }

        System.out.println();
        java.util.Iterator<Integer> num = al.iterator();
        System.out.print("Numbers: ");
        while(num.hasNext()){
            System.out.print(num.next() + ", ");
        }


        /** Other Methods */

        System.out.println("\nOther Methods");
        // remove()
        str.remove();
        System.out.println("Removed Elements: " + animals);
        // hasNext()
        System.out.println("Updated List");
        while(str.hasNext()){
            // forEachRemaining()
            str.forEachRemaining((value) -> System.out.print(value + ", "));
        }
    }
}
