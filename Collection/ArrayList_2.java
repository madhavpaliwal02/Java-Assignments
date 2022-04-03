package Java_Ad.Collection;

import java.util.ArrayList;

public class ArrayList_2 {
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

        // dislplay size
        System.out.println("The size is "+ myAL.size());

        // trim the unused space
        myAL.trimToSize();

        // Getting value at specify index
        System.out.println(myAL.get(2));

        // Returns a shallow copy
       ArrayList<Integer> al2  = (ArrayList<Integer>)myAL.clone();

        // replacing element at specified index / searching
        myAL.set(2, 45);

        // looking for existence of a specified element
        System.out.println(myAL.contains(15));

        // getting index of specify value
        System.out.println(myAL.indexOf(85));           // First Occurence
        System.out.println(myAL.lastIndexOf(85));    // Last Occurence

        // conversion array list to array, string etc
        myAL.toArray();
        // myAL.toString();

        // Printing the array list
        System.out.println(myAL);



    }
}
