package Java_Ad.Multithreading;

class Suspend extends Thread{
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

public class Thread_11_Suspend {
    public static void main(String[] args) {
        Suspend s1 = new Suspend();
        Suspend s2 = new Suspend();
        Suspend s3 = new Suspend();

        s1.start();
        s2.start();
        // Calling suspend method for
        s2.suspend();

        s3.start();


    }
}
