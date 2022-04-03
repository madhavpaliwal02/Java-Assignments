import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueue_1 {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(5);

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

            // Printing blocking Queue
            System.out.println(bq);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
