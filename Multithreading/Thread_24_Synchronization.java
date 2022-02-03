package Java_Ad.Multithreading;

class Table2{
    synchronized void printTable(int num){
        for(int i=1; i<=10; i++){
            System.out.println(num * i);
            try{
//                Thread.sleep(500);
            } catch (Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread11 extends Thread{
    Table2 t;
    MyThread11(Table2 t){
        this.t = t;
    }
    public void run(){
        t.printTable(5);
    }
}

class MyThread22 extends Thread{
    Table2 t;
    MyThread22(Table2 t){
        this.t = t;
    }
    public void run(){
        t.printTable(100);
    }
}

public class Thread_24_Synchronization {
    public static void main(String[] args) {
        Table2 obj2 = new Table2();

        MyThread11 t1 = new MyThread11(obj2);
        MyThread22 t2 = new MyThread22(obj2);

        t1.start();
        t2.start();
    }
}