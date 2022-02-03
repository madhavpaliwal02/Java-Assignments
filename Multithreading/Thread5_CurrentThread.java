package Java_Ad.Multithreading;

class Th5 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread());
    }
}

public class Thread5_CurrentThread {
    public static void main(String[] args) {
        Th5 obj1 = new Th5();
        obj1.start();
    }
}
