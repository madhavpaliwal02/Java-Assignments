package Java_Ad.Multithreading;

// Creating a thread by extending thread class

class Th1 extends Thread {
    int i=0;
    public void run(){
        while(i <10) {
            System.out.println("My Name is A1");
            i++;
        }
    }
}

class Th2 extends Thread {
    int i=0;
    public void run(){
        while(i<10)
        {
            System.out.println("My Name is B1");
            i++;
        }
    }
}

public class Thread1 {
    public static void main(String[] args) {
        Th1 obj1 = new Th1();
        Th2 obj2 = new Th2();
        obj1.start();
        obj2.start();

    }
}