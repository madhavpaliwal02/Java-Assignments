package Java_Ad.Multithreading;

class Th91 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().isAlive());
    }
}

public class Thread9_IsAlive {
    public static void main(String[] args) {
        Th91 obj1 = new Th91();
        obj1.start();
    }
}
