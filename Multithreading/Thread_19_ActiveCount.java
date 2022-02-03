package Java_Ad.Multithreading;

class ActiveCount extends Thread{
    public ActiveCount(String tName, ThreadGroup tg) {
        super(tg, tName);
        start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println(i);
    }
}

public class Thread_19_ActiveCount {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("Parent");

        ActiveCount a1 = new ActiveCount("T1" ,g1);
        ActiveCount a2 = new ActiveCount("T2" ,g1);

        System.out.println("The mo of active threads are: " + g1.activeCount());
        System.out.println("Thread Group is: " + a1.getThreadGroup().getName());
    }
}
