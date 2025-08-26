package ex_31_Collections_Framework_DSA.List.MAP;
import java.util.*;
public class Lab227_HashTable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.


        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null); // java.lang.NullPointerException
//        ht1.put(null, "three");  // java.lang.NullPointerException
        System.out.println(ht1);


        HashMap<Integer,String> ht2 = new HashMap<>();
        // Not Thread Safe, or Not Synchronised
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(3, null); // null value allowed in Hashmap
        ht2.put(null, null);// null Key allowed in Hashmap
        System.out.println(ht2);

        System.out.println("  ---- ");
        System.out.println("Enumeration support in legacy class");


        Enumeration<Integer> e  = ht1.keys(); // checking with HashTable
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());

        }
    }
}
