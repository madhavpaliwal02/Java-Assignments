package Java_Ad.Collection;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueue_1 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.add("Madhav Paliwal");
        pq.add("Drakshi Chopra");
        pq.add("Ishika Paliwal");
        pq.add("Palak Porwal");

        // Offerring elements, add only if the queue is not full
        pq.offer("Madhav");
        pq.offer("Madhav Paliwal");

        // Removing elements from the priority queue
        // Returns and removes the head of the queue
        System.out.println(pq.poll());
        // Removes the specified elements of the queue
        pq.remove();
        pq.remove("Madhav Paliwal");
        new PriorityQueue().removeAll(pq);

        // Iterating using Iterator
        Iterator<String> it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.println(", ");
        }

    }
}
