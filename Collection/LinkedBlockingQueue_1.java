import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class LinkedBlockingQueue_1 {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new LinkedBlockingQueue<>(5);

        try{
            // Adding elements to the blocking queue
            bq.add("Madhav Paliwal");
            bq.add("Drakshi Chopra");

            // Adding new elements, only if it is not existed
            bq.offer("Ishika Paliwal");
            bq.offer("Kashish Ahuja");

            // Returning head of the queue
            System.out.println(bq.element());

            // Return the elements from the front of the linked blocking queue
            System.out.println(bq.peek());

            // Printing blocking Queue
            System.out.println(bq);

            // Removing Elements
            bq.remove("Kashish Ahuja");     // Using remove
            bq.poll();                         // Using poll
            bq.clear();                        // Using clear

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
