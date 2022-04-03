import java.util.ArrayList;
import java.util.Comparator;

public class ArrayList_1 {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        // Adding functions
        myAL.add(12);   // add(value)
        myAL.add(0, 85);    // add (index, value)

        // Declare an another array list
        ArrayList<Integer> al = new ArrayList<>();
        al.add(15);
        al.add(85);
        // Appending one arraylist with another
        myAL.addAll(al);    // (myAL + al)

        // Removing functions
        /*myAL.remove(1);     // remove(index)
        al.removeAll(al);       // remove(Collection)

        // Removes all the element or clear the list
        myAL.clear();*/

        // dislplay size
        System.out.println("The size is "+ myAL.size());

        // returns true if list is empty
        System.out.println(myAL.isEmpty());

        // reverse sorting
        myAL.sort(Comparator.reverseOrder());

        // retaining elements
        myAL.retainAll(myAL);

        // trim the unused space
        myAL.trimToSize();

        // Printing the array list
        System.out.println(myAL);
    }
}