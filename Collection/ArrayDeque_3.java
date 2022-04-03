package Java_Ad.Collection;

import java.util.ArrayDeque;

public class ArrayDeque_3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> myD = new ArrayDeque<>();

        myD.addFirst(10);
        myD.addLast(46);

        myD.offerFirst(12);
        myD.offerLast(20);

        myD.poll();
        myD.pollFirst();
        myD.pollLast();
//
        myD.clear();

        myD.addFirst(84);
        myD.addLast(69);
        myD.addLast(96);

        System.out.println("Element() method " + myD.element());
        System.out.println("contains() method " +myD.contains(10));
        System.out.println("size() method " + myD.size());
        System.out.println("clone() method" +myD.clone());

        System.out.println(myD);
    }
}
