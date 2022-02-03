package Java_Ad.Multithreading;

class Daemon extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon())
            System.out.println("Daemon Thread");
        else
            System.out.println("Not Daemon Thread");
    }
}

public class Thread_15_Daemon {
    public static void main(String[] args) {
        Daemon d1 = new Daemon();
        Daemon d2 = new Daemon();
        Daemon d3 = new Daemon();

        d1.setDaemon(true);

        d1.start();
        d2.start();
        d3.start();
    }
}
