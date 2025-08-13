package ex_14_Array;

public class Lab122_IQ_SecondLargest {
    public static void main(String[] args) {
        int[] value = {10, 11, 13, 12, 20};
        int max= value[0];
        int secondLargest = value[0];
        for (int i = 0; i <value.length ; i++) {
            if (value[i]>max){
                max=value[i];
                secondLargest= value[value.length-2];// length-2 will print second largest
                //array index is 0 to 4
                //array length is 5 if you give -1 then it will 5-1 =4 first largest will print
                //length-2 will print second largest
            }
        }
        System.out.println("Second Largest value-->"+secondLargest);
    }
}
