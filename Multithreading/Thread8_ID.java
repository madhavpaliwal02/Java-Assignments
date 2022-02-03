package Java_Ad.Multithreading;

class Th81 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }
}
public class Thread8_ID {
    public static void main(String[] args) {
        Th81 obj1 = new Th81();
        obj1.start();
    }
}
