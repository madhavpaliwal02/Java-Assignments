package Java_Ad.Multithreading;

class Th61 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class Th62 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class Th63 extends Thread {
    int i=0;
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

public class Thread6_Priority {
    public static void main(String[] args) {
        Th61 obj1 = new Th61();
        Th62 obj2 = new Th62();
        Th63 obj3 = new Th63();

        System.out.println(obj1.getPriority());
        obj1.start();
        obj2.setPriority(9);
        System.out.println(obj2.getPriority());
        obj2.start();
        obj3.setPriority(3);
        System.out.println(obj3.getPriority());
        obj3.start();

    }
}
