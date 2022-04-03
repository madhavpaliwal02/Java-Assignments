package Java_Ad.Multithreading;

class Resume extends Thread{
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

public class Thread_12_Resume {
    public static void main(String[] args) {
        Resume r1 =  new Resume();
        Resume r2 =  new Resume();
        Resume r3 =  new Resume();

        r1.start();
        r2.start();
        System.out.println("Suspending the thread");
        r2.suspend();   // Suspending
        r3.start();
        System.out.println("Resuming the thread");
        r2.resume();    // Resuming
    }
}
