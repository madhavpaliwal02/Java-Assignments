import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String[] args) {
        LinkedList<String> myLL = new LinkedList<>();
        myLL.add("Madhav");
        myLL.addLast("Ishika");
        myLL.addFirst("Avanti");
        myLL.add(1,"Tanishq");
        myLL.addFirst("Drakshi");
        myLL.addLast("Chirag");
        for (String Name : myLL){
            System.out.println(Name);
        }
        System.out.println();
        System.out.println("ELement " + myLL.element());
        System.out.println("Get" + myLL.get(2));
        System.out.println("get First" +myLL.getFirst());
        System.out.println("get Last" +myLL.getLast());
        System.out.println("indexof" +myLL.indexOf("Chirag"));
        System.out.println("peek" +myLL.peek());
        System.out.println("remove" +myLL.remove());
        System.out.println("set" +myLL.set(2, "Rakshas"));
    }
}
