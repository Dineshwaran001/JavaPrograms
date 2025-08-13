package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.*;

public class Lab212_ArrayL_IV {
    public static void main(String[] args) {
        List mark = new ArrayList();
        mark.add(99);
        mark.add(100);
        mark.add(90);
        mark.add(80);
        mark.add(15);
        System.out.println(mark);
        Collections.sort(mark);
        System.out.println(mark);
Collections.reverse(mark);

        System.out.println(mark);
        Collections.reverseOrder();
        System.out.println(mark);
        //Collection is Interface
        //Collections is class
    }
}
