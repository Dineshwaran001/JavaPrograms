package ex_14_Array;

public class Lab113_Array_Print {
    public static void main(String[] args) {
        int[] a ={22,33,44,55,66};
//        System.out.println(a[0]);// start from 0
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//        System.out.println(a[3]);
//        System.out.println(a[4]);
        for (int i = 0; i <a.length ; i++) { // index of array start from 0 and length -1 means length is 5 but we have to check 0 to 4
            System.out.println(a[i]);
        }
    }
}
