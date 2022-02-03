package Java_Ad.Multithreading;

// Creating a thread by implementing Runnable Interface

class Run1 implements Runnable {
    int i=0;
    public void run(){
        while(i <10) {
            System.out.println("My Name is A1");
            i++;
        }
    }
}

class Run2 implements Runnable {
    int i=0;
    public void run(){
        while(i<10)
        {
            System.out.println("My Name is B1");
            i++;
        }
    }
}

public class Thread2 {
    public static void main(String[] args) {
        Run1 r1 = new Run1();
        Run2 r2 = new Run2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
