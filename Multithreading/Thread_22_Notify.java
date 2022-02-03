package Java_Ad.Multithreading;

class Notify1 extends Thread{
    public void run(){
        synchronized (this){
            System.out.println("Starting of " + Thread.currentThread().getName());
            try{
                this.wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " notified");
        }
    }
}

class Notify2 extends Thread{
    Notify1 not1;

    Notify2(Notify1 notify1){
        not1 = notify1;
    }

    public void run(){
        synchronized (this.not1){
            System.out.println("Starting of " + Thread.currentThread().getName());
            try{
                this.not1.wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " notified");
        }
    }
}

class Notify3 extends Thread{
    Notify1 not1;

    Notify3(Notify1 notify1){
        not1 = notify1;
    }

    public void run(){
        synchronized (this.not1){
            System.out.println("Starting of " + Thread.currentThread().getName());
            // calling the notify() method
            this.not1.notify();
            System.out.println(Thread.currentThread().getName() + " notified");
        }
    }
}

public class Thread_22_Notify {
    public static void main(String[] args) throws InterruptedException {
        Notify1 not1 = new Notify1();
        Notify2 not2 = new Notify2(not1);
        Notify3 not3 = new Notify3(not1);

        Thread t1 = new Thread(not1, "T1");
        Thread t2 = new Thread(not2, "T2");
        Thread t3 = new Thread(not3, "T3");

        t1.start();
        t2.start();
        Thread.sleep(500);
        t3.start();
    }
}
