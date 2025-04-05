package ex_014_Array;

public class Lab114_Array_Max {
    public static void main(String[] args) {
        int[] a ={22,33,44,55,66};
        int max = a[0]; // start with a[0]
        for (int i = 0; i <a.length ; i++) {
            if (a[i]> max){
                max=a[i];
            }

        }
        System.out.println(max);
    }
}
