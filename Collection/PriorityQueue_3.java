import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_3 {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        // Adding elements to the priority queue
        pq.add("Madhav Paliwal");
        pq.add("Drakshi Chopra");
        pq.add("Ishika Paliwal");
        pq.add("Kashish Ahuja");

        // Offerring elements, add only if the queue is not full
        pq.offer("Madhav");
        pq.offer("Madhav Paliwal");
        // Iterating using Iterator
        Iterator<String> it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.println(", ");
        }

        // Checking whether elements exists or not
        System.out.println(pq.contains("Mahdav"));  // False
        System.out.println(pq.contains("Madhav"));  // True

        // Size of a Priority Queue
        System.out.println(pq.size());

        // conversion Priority Queue to array, string etc
        pq.toArray();
        pq.toString();

        // Printing Priority Queue
        System.out.println(pq);

    }
}
