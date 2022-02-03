package Java_Ad.Multithreading;

class Customer{
    int amount = 10000;

    synchronized void withdrew(int amount){
        System.out.println("going to withdraw...");

        if(this.amount < amount){
            System.out.println("Less balance; waiting for deposit...");

            try{
                wait();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    synchronized void  deposit(int amount){
        System.out.println("going to deposit...");
        this.amount += amount;
        System.out.println("deposit completed...");
        notify();
    }
}

public class Thread_25_InterThreadComm {
    public static void main(String[] args) {
        final Customer c = new Customer();

        new Thread(){
            @Override
            public void run() {
                c.withdrew(15000);
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
