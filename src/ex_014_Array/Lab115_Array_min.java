package ex_014_Array;

import java.util.Arrays;

public class Lab115_Array_min {
    public static void main(String[] args) {
        int[] a ={22,33,44,55,66,10};
        int min =a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
