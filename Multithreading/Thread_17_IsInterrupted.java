package Java_Ad.Multithreading;

class IsInterrupt  extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

public class Thread_17_IsInterrupted {
    public static void main(String[] args) {
        IsInterrupt i1 = new IsInterrupt();
        IsInterrupt i2 = new IsInterrupt();

        i1.start();
        i2.start();

        System.out.println("I1 before " + i1.isInterrupted());
        System.out.println("I2 before " + i2.isInterrupted());

        i1.interrupt();

        System.out.println("I1 after " + i1.isInterrupted());
        System.out.println("I2 after " + i2.isInterrupted());
    }
}
