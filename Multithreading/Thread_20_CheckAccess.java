package Java_Ad.Multithreading;

class CheckAccess extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Finished");
    }
}

public class Thread_20_CheckAccess {
    public static void main(String[] args) {
        CheckAccess c1 = new CheckAccess();
        CheckAccess c2 = new CheckAccess();

        c1.start();
        c2.start();

        c1.checkAccess();
        System.out.println(c1.getName() + " Has access");
        c2.checkAccess();
        System.out.println(c2.getName() + " Has access");
    }
}
