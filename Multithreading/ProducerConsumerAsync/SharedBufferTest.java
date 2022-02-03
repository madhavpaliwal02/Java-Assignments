package Java_Ad.Multithreading.ProducerConsumerAsync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedBufferTest {
    public static void main(String[] args) {
        ExecutorService app = Executors.newFixedThreadPool(2);

        Buffer sharedlocation = new UnsynchronizedBuffer();

        System.out.println("Action\t\tValue\t\tProduced\tConsumed");

        try{
            app.execute(new Producer(sharedlocation));
            app.execute(new Consumer(sharedlocation));
        }
        catch (Exception e){
            e.printStackTrace();
        }

        app.shutdown();
    }
}
