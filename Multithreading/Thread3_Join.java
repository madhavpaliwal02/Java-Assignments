package Java_Ad.Multithreading;

// Using Join Method in multithreading

class Th31 extends Thread {
    int i=0;
    public void run(){
        while(i <20) {
            System.out.println("My Name is A1");
            i++;
        }
    }
}

class Th32 extends Thread {
    int i=0;
    public void run(){
        while(i<20)
        {
            System.out.println("My Name is B1");
            i++;
        }
    }
}

class Th33 extends Thread {
    int i=0;
    public void run(){
        while(i<20)
        {
            System.out.println("My Name is C1");
            i++;
        }
    }
}

public class Thread3_Join {
    public static void main(String[] args) {
        Th31 obj1 = new Th31();
        Th32 obj2 = new Th32();
        Th33 obj3 = new Th33();
        obj1.start();

        try{
            obj1.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }


        obj2.start();
        obj3.start();
    }
}
