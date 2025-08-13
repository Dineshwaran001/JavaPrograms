package ex_31_Collections_Framework_DSA.List.LIST;
import java.util.*;
public class Lab214_Stack {
    public static void main(String[] args) {

        // Stack
        // List In -> First Out ( LIFO)
//        Stack s = new Stack();
//        s.add("Pramod");
//        s.add("Dutta");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("Pramod");
        s.push("Dutta");
        s.push("Amit");
        s.push("Amit2");
        System.out.println(s);

        System.out.println("Size-->"+s.size());
        System.out.println("Peek tell the last element-->"+s.peek());
        System.out.println("print the s-->"+s);
        System.out.println("Pop will remove the last element-->"+s.pop());
        System.out.println("print the s-->"+s);


        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        System.out.println(s);
        s.add("Chetan");
        s.add("Chetan");
        s.push("Vijay");
        System.out.println(s);



    }
}
