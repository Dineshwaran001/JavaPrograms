package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.ListIterator;
import java.util.Vector;

public class Lab210_Vector_ListIterator {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Item 1");
        v.add("Item 2");
        v.add("Item 3");
        v.add("Item 4");
        v.add("Item 5");

        ListIterator ls = v.listIterator();
        while(ls.hasNext()){
            System.out.println(ls.next());

        }
        System.out.println("without these next() method previous() method will not work");
        while(ls.hasPrevious()){
            System.out.println("");
            System.out.println(ls.previous());
        }
    }
}
