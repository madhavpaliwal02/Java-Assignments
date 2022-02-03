package Java_Ad.Multithreading;

class Th71 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class Th72 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Thread7_Name {
    public static void main(String[] args) {
        Th71 obj1 = new Th71();
        obj1.start();

        Th71 obj2 = new Th71();
        obj2.setName("Madhav");
        obj2.start();
    }
}
