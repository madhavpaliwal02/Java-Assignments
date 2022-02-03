package Java_Ad.Multithreading.ProducerConsumerAsync;

public class UnsynchronizedBuffer implements  Buffer{

    private int buffer = -1;

    @Override
    public void set(int value) {
        System.out.printf("Producer writes\t%2d", value);
        buffer = value;
    }

    @Override
    public int get() {
        System.out.printf("Consumer reads\t%2d", buffer);
        return buffer;
    }
}
