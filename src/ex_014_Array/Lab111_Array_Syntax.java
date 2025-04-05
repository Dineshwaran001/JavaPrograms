package ex_014_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab111_Array_Syntax {
    public static void main(String[] args) {
        int[] a ={22,33,44,55,66};
        System.out.println(a.length);// total - 5
        System.out.println(Arrays.toString(a));// print all the values in the arrays
        System.out.println(a[0]);// start from 0
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        String[] name ={"dinesh","waran","T"};
        System.out.println(Arrays.toString(name));
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    }
}
