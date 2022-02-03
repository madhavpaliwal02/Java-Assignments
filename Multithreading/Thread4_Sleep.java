package Java_Ad.Multithreading;

// Using Sleep Methoc

class Th41 extends Thread {
    int i=0;
    public void run(){
        while(i <10) {
            System.out.println("My Name is A1");
            i++;
            try{
                sleep(200);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class Thread4_Sleep {
    public static void main(String[] args) {
        Th41 t1 = new Th41();
        t1.start();
    }
}
