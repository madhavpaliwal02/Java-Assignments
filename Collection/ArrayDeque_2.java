import java.util.ArrayDeque;

public class ArrayDeque_2 {
    public static void main(String[] args) {
        ArrayDeque<Integer> myD = new ArrayDeque<>();

        myD.addFirst(10);
        myD.addLast(46);

        myD.offerFirst(12);
        myD.offerLast(20);

        myD.getFirst();
        myD.getLast();

        myD.peekFirst();
        myD.peekLast();
        System.out.println(myD);
    }
}
