package Java_Ad.Multithreading;

class Yield extends Thread{
    public void run(){
        for (int i=0; i<3; i++)
            System.out.println(Thread.currentThread().getName() + " in control");
    }
}

public class Thread10_Yield{
    public static void main(String[] args) {
        Yield th1 = new Yield();
        Yield th2 = new Yield();

        th1.start();
        th2.start();

        for (int i=0; i<3; i++){
            th1.yield();
            System.out.println(Thread.currentThread().getName() + " in control");
        }
    }
}
