package Java_Ad.Multithreading;

class GetState extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getState());
    }
}

public class Thread_21_GetState {
    public static void main(String[] args) {
        GetState g = new GetState();
        System.out.println("Checking thread state of current thread");
        g.start();
    }
}
