package Java_Ad.Multithreading;

class NotifyAll1 extends Thread{
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

class NotifyAll2 extends Thread{
    NotifyAll1 not1;

    NotifyAll2(NotifyAll1 NotifyAll1){
        not1 = NotifyAll1;
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

class NotifyAll3 extends Thread{
    NotifyAll1 not1;

    NotifyAll3(NotifyAll1 NotifyAll1){
        not1 = NotifyAll1;
    }

    public void run(){
        synchronized (this.not1){
            System.out.println("Starting of " + Thread.currentThread().getName());
            // calling the NotifyAll() method
            this.not1.notifyAll();
            System.out.println(Thread.currentThread().getName() + " notified");
        }
    }
}

public class Thread_22_NotifyAll {
    public static void main(String[] args) throws InterruptedException {
        NotifyAll1 not1 = new NotifyAll1();
        NotifyAll2 not2 = new NotifyAll2(not1);
        NotifyAll3 not3 = new NotifyAll3(not1);

        Thread t1 = new Thread(not1, "T1");
        Thread t2 = new Thread(not2, "T2");
        Thread t3 = new Thread(not3, "T3");

        t1.start();
        t2.start();
        Thread.sleep(500);
        t3.start();
    }
}
