package ex_014_Array;

import java.util.Scanner;

public class Lab117_Array_UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = scan.nextInt(); // this is to take size of array
        int[] mark = new int[size];//size can be given here
         // below code is to take the user input
        for (int i = 0; i <mark.length ; i++) {
            System.out.println("Enter the number");
               mark[i]=scan.nextInt();// mark[0]mark[1]mark[2] we can take user input here
        }
        for (int i = 0; i <mark.length ; i++) {
            System.out.println("Array inside-->" + mark[i]);
        }

    }
}
