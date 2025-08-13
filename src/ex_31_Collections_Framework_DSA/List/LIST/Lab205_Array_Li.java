package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab205_Array_Li {
    public static void main(String[] args) {
        //if we dont specify using <Integer> between them it will accept all the data types
        List list = new ArrayList();
list.add("String data type"); // index ->0
list.add(4);// index ->1
list.add(5.0);// index ->2
list.add(59.00);// index ->3
list.add(true);// index ->4
list.add(5.0);// index ->5
        System.out.println(list); //print all the element
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("String data type")); // for String we have to give in double quotes
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(59.00));
        System.out.println(list.lastIndexOf(5.0));// two time there is 5.0 so last position of 5.0

        System.out.println("_____________________________________");
        for(int i =0; i< list.size(); i++){
            System.out.println(list.get(i));        }
        list.clear();// these command will remove all the element
        System.out.println(list);
    }

}
