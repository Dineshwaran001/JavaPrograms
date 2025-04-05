package ex_014_Array;

public class Lab121_Array_ForEach {
    public static void main(String[] args) {
        int[] value = {10, 11, 12, 12, 20};
        int sum=0;
        for(int i:value){
            sum=sum+i; //Sum of values
        }
        System.out.println(sum);
    }
}
