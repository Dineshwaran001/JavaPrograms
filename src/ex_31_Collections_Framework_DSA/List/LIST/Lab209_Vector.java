package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;
// having Vector class and using Iterator, Enumeration iterate through each and every element
public class Lab209_Vector {
    static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10); // we can mention inital capacity also like arraylist

        v1.add("Dinesh");
        v1.add("Waran");
        v1.add("T");
        v1.add(10);
        v1.add(null);
        v1.add(true);
        System.out.println("Printing all");
        System.out.println(v1);

        System.out.println("___Normal Loop___");
        for (int i = 0; i <v1.size() ; i++) {
            System.out.println(v1.get(i));
        }

        System.out.println("----For Each Loop----");
        for(Object o: v1){ // we didnt mention data type for vector thats why we use Object here
            System.out.println(o);
        }

        System.out.println("----Iterator-----");
        Iterator iterator = v1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("----Enumeration-----");
        Enumeration <Object> enumeration =v1.elements(); // we have to give object data type here
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

        System.out.println("______________List Iterator_______________");
        ListIterator listIterator =  v1.listIterator();
        while ((listIterator.hasNext())){
            System.out.println(listIterator.next());
        }
        System.out.println("______________List Iterator(has Previous)_It is going Backward______________");
        while ((listIterator.hasPrevious())){
            System.out.println(listIterator.previous());
        }
    }
}
