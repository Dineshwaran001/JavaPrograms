package ex_014_Array;

public class Lab120_Array_Sum {
    public static void main(String[] args) {
        int[] value = {10, 11, 12, 12, 20};
        int sum=0; // initialize with 0
        for (int i = 0; i <value.length ; i++) {
            sum= sum+value[i];
        }
        System.out.println(sum);
    }
}
