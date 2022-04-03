import java.util.ArrayList;

public class ArrayList_3 {
    public static void main(String[] args) {
        ArrayList<Integer> myAL = new ArrayList<>();

        ArrayList<Integer> myALInt = new ArrayList<>();
        myALInt.add(10);
        myALInt.add(0,20);

        myALInt.addAll(myAL);
        System.out.println(myALInt);

        myALInt.clear();
        System.out.println(myALInt);
        ArrayList<Integer> mynew = new ArrayList<>();
        System.out.println(myAL.contains(10));
        System.out.println(myAL.get(1));
        System.out.println(myAL.indexOf(15));


        ArrayList<String> myALStr = new ArrayList<>(10);
        myALStr.add("Madhav");
        myALStr.add("Avanti");
        myALStr.add("Drakshi");
        System.out.println(myALStr);

        ArrayList<String> myALStr1 = new ArrayList<>(10);
        myALStr1.add( "Ishika");
        myALStr1.add(1, "Chirag");
        myALStr1.add(0, "Kashish");
        System.out.println(myALStr1);

        System.out.println(myALStr.remove("Drakshi"));
        System.out.println(myALStr);

//        myAL.

    }
}
