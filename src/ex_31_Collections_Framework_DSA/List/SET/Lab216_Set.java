package ex_31_Collections_Framework_DSA.List.SET;

import java.util.*;

public class Lab216_Set {
   public static void main(String[] args) {
        Set s = new HashSet();
        s.add("apple");
        s.add("Mango");
        s.add("Mango");
        s.add("orange");
       System.out.println(s);// duplicate not allowed
    }
}
