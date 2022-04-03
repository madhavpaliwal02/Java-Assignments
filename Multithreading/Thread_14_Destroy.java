package Java_Ad.Multithreading;

class Destroy extends Thread{

    Destroy(String tName, ThreadGroup tg){
        super(tg, tName);
        start();
    }

    public void run(){
        for (int i=0; i<5; i++){
            try{
                sleep(500);
                System.out.println(Thread.currentThread().getName() + " in control");
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

public class Thread_14_Destroy {
    public static void main(String[] args) throws Exception{
        // Creating a ThreadGroup
        ThreadGroup tg1 = new ThreadGroup("Parent Thread");
        // Creating a child ThreadGroup for parent Threadgroup
        ThreadGroup tg2 = new ThreadGroup(tg1, "Child Thread");

        // creating threads
        Destroy d1 =  new Destroy("Thread-1", tg1);
        System.out.println(tg1.getName() + " created");
        Destroy d2 =  new Destroy("Thread-2", tg1);
        System.out.println(tg2.getName() + " created");

        // block until other thread is finished
        d1.join();
        d2.join();

        // destroying child thread
        tg2.destroy();
        System.out.println(tg2.getName() + " destroyed");

        // destroying parent thread
        tg1.destroy();
        System.out.println(tg1.getName() + " destroyed");
    }
}
