import java.util.ArrayList;
import java.util.ListIterator;

public class IteratorList {
    public static void main(String[] args) {

        /** Array List */
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(4);
        al.add(16);
        al.add(49);
        al.add(72);
        al.add(58);

        ListIterator<Integer> iter = al.listIterator();


        /** Other Elements */

        // next()
        int num = iter.next();
        System.out.println("Next Element: " + num);
        // nextIndex()
        int index = iter.nextIndex();
        System.out.println("Index of next element: " + index);
        // hasNext()
        System.out.println("Is there any element exist after: " + iter.hasNext());

        // previous()
        int pre = iter.previous();
        System.out.println("Previous element: " + pre);
        // previousIndex()
        int index2 = iter.previousIndex();
        System.out.println("Index of previous element: " + index2);
        // hasPrevious()
        System.out.println("Is there any element exist before: " + iter.hasPrevious());




    }
}
