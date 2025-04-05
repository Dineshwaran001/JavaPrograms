package ex_014_Array;

import java.util.Arrays;

public class Lab116_ArrayMaxMin_MethodUsage {
    public static void main(String[] args) {
        int[] a = {22, 33, 44, 55, 66, 5};
        int max_output = arrayMax(a);// pass the array in the method(a)
        int min_output = arraymin(a);
        System.out.println(max_output);
        System.out.println(min_output);


    }

     static int arraymin(int a[]) {
        int min =a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

     static int arrayMax(int a[]) {
        int max =a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                }
            }
        return max;
    }

}





