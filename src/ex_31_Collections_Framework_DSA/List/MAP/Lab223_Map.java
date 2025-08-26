package ex_31_Collections_Framework_DSA.List.MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab223_Map {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put("FirstName","Dinesh");
        m.put("LastName","Waran");
        m.put("RollNo",1);
        m.put("Salary",60000);
        System.out.println("Hasmap does not maintain order");
        System.out.println(m);

        Map m1 = new LinkedHashMap();
        m1.put("FirstName","Naga");
        m1.put("LastName","Rajan");
        m1.put("RollNo",2);
        m1.put("Salary",50000);
        System.out.println("LinkedHashmap maintain Insertion order");
        System.out.println(m1);

        Map m2 = new TreeMap();
        m2.put("FirstName","Aravind");
        m2.put("LastName","K");
        m2.put("RollNo",3);
        m2.put("Salary",80000);
        System.out.println("Tree have natural sorting based on key names");
        System.out.println(m2);
    }
}
