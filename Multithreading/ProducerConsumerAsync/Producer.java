package Java_Ad.Multithreading.ProducerConsumerAsync;

import java.util.Random;

public class Producer  implements Runnable{
    private static  Random generator = new Random();
    private Buffer sharedLocation;

    // Constructer
    public Producer (Buffer shared){
        sharedLocation = shared;
    }

    public void run(){
        int sum=0;

        for (int count=1; count<=10; count++){
            try{
                Thread.sleep(generator.nextInt(3000));
                sharedLocation.set(count);
                sum += count;
                System.out.printf("\t%2d\n", sum);

            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.printf("\n%s\n%s\n", "Producer done producing.", "Terminating Producer");
        }
    }
}














