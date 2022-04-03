import java.util.Comparator;
import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();

        // Adding functions
        vec.add(12);   // add(value)
        vec.add(0, 85);    // add (index, value)

        // Declare another vector
        Vector<Integer> v = new Vector<>();
        v.add(15);
        v.add(85);
        // Appending one Vector with another
        vec.addAll(v);    // (vec + v)

        // Removing functions
        /*vec.remove(1);     // remove(index)
        v.removeAll(v);       // remove(Collection)

        // Removes all the element or clear the list
        vec.clear();*/

        // dislplay size
        System.out.println("The size is "+ vec.size());

        // ensuring minimum capacity
        vec.ensureCapacity(10);

        // returns true if list is empty
        System.out.println(vec.isEmpty());

        // reverse sorting
        vec.sort(Comparator.reverseOrder());

        // retaining elements
        vec.retainAll(vec);

        // trim the unused space
        vec.trimToSize();

        // Printing the vector
        System.out.println(vec);

    }
}
