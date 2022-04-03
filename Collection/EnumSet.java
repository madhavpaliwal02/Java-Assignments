import java.util.Iterator;

public class EnumSet {

    enum Size {
        SMALL, MEDIUM, LARGE, EXTRALARGE
    }

    public static void main(String[] args) {

        /** Type-1 -> Operations */

        /** Creating Enum Set */
        // 1. allOf(Size) - include every element
        java.util.EnumSet<Size> size = java.util.EnumSet.allOf(Size.class);
        System.out.println("Size: " + size);

        // 2. noneOf(Size) - include none element
        java.util.EnumSet<Size> size2 = java.util.EnumSet.noneOf(Size.class);
        System.out.println("Size2: " + size2);

        // 3. range(e1, e2) - include range of inclusive element
        java.util.EnumSet<Size> size3 = java.util.EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
        System.out.println("Size3: " + size3);

        // 4. of() - include only selected element
        java.util.EnumSet<Size> size4 = java.util.EnumSet.of(Size.LARGE, Size.SMALL);
        System.out.println("Size4 : " + size4);


        /** Inserting */
        // add()
        size2.add(Size.MEDIUM);
        System.out.println("Adding size-medium to size2: " + size2);
        // addAll()
        size2.addAll(size);
        System.out.println("Adding all elements of size-1 to size2: " + size2);


        /** Accessing */
        Iterator<Size> iter = size.iterator();
        System.out.println("Size: ");
        while(iter.hasNext()){
            System.out.println(iter.next() + ", ");
        }

        /** Removing */
        // remove()
        System.out.println(size3.remove(Size.MEDIUM));
        System.out.println("Removing medium from size3: " + size3);
        // removeAll() - size2 - size4
        System.out.println(size2.removeAll(size4));
        System.out.println("Removing all elements of size4: " + size4);


        /** Type-2 -> Operations */

        // clone()
        size2.copyOf(size3);

        // isEmpty()
        System.out.println("Checking size2 is empty or not: " + size2.isEmpty());

        // size()
        System.out.println("Checking size of size1: " + size.size());

        // clear()
        size2.clear();

        // contains()
        System.out.println("Checking the existence of small in size1: " + size.contains(Size.SMALL));
    }
}
