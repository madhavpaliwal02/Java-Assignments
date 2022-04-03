import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_2 {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new LinkedBlockingQueue<>(5);

        try{
            // Adding elements to the blocking queue
            bq.add("Madhav Paliwal");
            bq.add("Drakshi Chopra");

            // Adding new elements, only if it is not existed
            bq.offer("Ishika Paliwal");
            bq.offer("Kashish Ahuja");

            // Add using put
            bq.put("Madhav");
            // Remove using take
            bq.take();

            // Checking whether elements exists or not
            System.out.println(bq.contains("Mahdav"));  // False
            System.out.println(bq.contains("Madhav Paliwal"));  // True

            // Size of a Priority Queue
            System.out.println(bq.size());

            // conversion Priority Queue to array, string etc
            bq.toArray();
            // pq.toString();

            // Printing blocking Queue
            System.out.println(bq);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
