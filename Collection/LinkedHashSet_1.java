import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class LinkedHashSet_1 {
    public static void main(String[] args) {

        /** Type-1 -> Operations */

        /** Creating */
        // By the object of class
        LinkedHashSet<String> name = new LinkedHashSet<>(10);
        LinkedHashSet<String> name2 = new LinkedHashSet<>();

        // By Other Collections - Array list
        ArrayList<String> al = new ArrayList<>();
        al.add("Kashish Ahuja");
        al.add("Palak Porwal");
        LinkedHashSet<String> name3 = new LinkedHashSet<>(al);


        /** Inserting */
        // add()
        name.add("Avanti Gupta");
        name.add("Drakshi Chopra");
        System.out.println("Adding elements to name using add(): " + name);
        name2.add("Chirag Sharma");
        name2.add("Tanishq Sisodiya");
        name2.add("Madhav Paliwal");
        System.out.println("Adding elements to name2 using add(): " + name2);
        // addAll()
        name.addAll(name2);
        System.out.println("Adding name2 to name using addAll(): " + name);

        /** Accessing */
        Iterator<String> iter = name.iterator();
        System.out.println("Name: ");
        while(iter.hasNext()){
            System.out.println(iter.next() + ", ");
        }

        /** Removing */
        // remove()
        System.out.println("Removing Madhav Paliwal from name2" + name2.remove("Madhav Paliwal"));
        // removeAll() - name - name2
        System.out.println("Removing name2 from name: " + name.removeAll(name2));


    }
}
