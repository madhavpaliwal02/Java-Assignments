package Java_Ad.Multithreading;

class Interrupted  extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

public class Thread_18_Interrupted {
    public static void main(String[] args) {
        Interrupted i1 = new Interrupted();
        Interrupted i2 = new Interrupted();

        i1.start();
        i2.start();
        System.out.println("Threads before interrupted");
        System.out.println("I1 before " + i1.interrupted());
        System.out.println("I2 before " + i2.interrupted());

        i1.interrupt();
        System.out.println("Threads after interrupted");
        System.out.println("I1 after " + i1.interrupted());
        System.out.println("I2 after " + i2.interrupted());
    }
}
