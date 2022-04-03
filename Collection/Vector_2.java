import java.util.Vector;

public class Vector_2 {
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

       // Getting value at specify index
        System.out.println(vec.get(2));

        // Returns a shallow copy
       Vector<Integer> v2  = (Vector<Integer>)vec.clone();

        // replacing element at specified index / searching
        vec.set(2, 45);

        // looking for existence of a specified element
        System.out.println(vec.contains(15));

        // getting index of specify value
        System.out.println(vec.indexOf(85));           // First Occurence
        System.out.println(vec.lastIndexOf(85));    // Last Occurence

        // conversion vector to array, string etc
        vec.toArray();
        // vec.toString();

        // Printing the vector
        System.out.println(vec);

    }
}
