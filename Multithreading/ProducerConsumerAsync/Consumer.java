package Java_Ad.Multithreading.ProducerConsumerAsync;

import java.util.Random;

public class Consumer implements Runnable {
    private static Random generator = new Random();
    private Buffer sharedLocation;

    // Constructer
    public Consumer(Buffer shared) {
        sharedLocation = shared;
    }

    public void run() {
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            try {
                Thread.sleep(generator.nextInt(3000));
                sum += sharedLocation.get();
                System.out.printf("\t\t\t%2d\n", sum);
            }
            catch (Exception e){
                e.printStackTrace();
        }
            System.out.printf("\n%s %d. \n%s\n", "Cunsumer read values totaling", sum, "Terminating Consumer");
    }
}
}















