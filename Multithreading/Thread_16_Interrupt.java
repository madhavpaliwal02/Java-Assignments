package Java_Ad.Multithreading;

class Interrupt extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName() + " in control");
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread Interuppted..." + e);
            }
            System.out.println("Thread is running");
        }
    }
}

class Interrupt2 extends Thread {
    public void run() {
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName() + " in control");
            } catch (InterruptedException e) {
                System.out.println("Exception Handled..." + e);
            }
            System.out.println("Thread is running");
    }
}

class Interrupt3  extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

public class Thread_16_Interrupt {
    public static void main(String[] args) {
        // Type - 1 -> Interrupting a thread that stops working
//        Interrupt i1 = new Interrupt();
//        i1.start();
//        try{
//            i1.interrupt();
//        }
//        catch (Exception e){
//            System.out.println("Excpetion handled " + e);
//        }

        // Type - 2 -> Interrupting a thread that doesn't stop working
//        Interrupt2 i2 = new Interrupt2();
//        i2.start();
//        i2.interrupt();

        // Type - 3 -> Interrupting a thread that behaves normally
        Interrupt3 i3 = new Interrupt3();
        i3.start();
        System.out.println("Thread started");
        i3.interrupt();
        System.out.println("Thread interuppted using interrupt() method");

    }
}
