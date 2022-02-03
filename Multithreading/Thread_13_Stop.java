package Java_Ad.Multithreading;

class Stop extends Thread{
    public void run(){
        for (int i=0; i<5; i++){
            try{
                sleep(500);
                System.out.println(Thread.currentThread().getName() + " in control");
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class Thread_13_Stop {
    public static void main(String[] args) {
        Stop s1 =  new Stop();
        Stop s2 =  new Stop();
        Stop s3 =  new Stop();

        s1.start();
        s2.start();
        s3.stop();      // Stopping
        System.out.println("Thread-3 is stopped" + Thread.currentThread().getName());
    }
}
