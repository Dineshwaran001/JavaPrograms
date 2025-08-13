package ex_14_Array;

import java.util.Scanner;

public class Lab118_Array_UI_Max_Min {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int size = scan.nextInt();
        int[] marks= new int[size];

        for (int i = 0; i <marks.length ; i++) {
            System.out.println("Enter the number");
            marks[i]= scan.nextInt();// we scan here user input
        }
        int max =marks[0];
        for (int i = 0; i <marks.length ; i++) {
            if (marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("Maximum value-->"+max);

        int min =marks[0];
        for (int i = 0; i <marks.length ; i++) {
            if (marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("Minimum value-->"+min);
        scan.close();// close the scanner
    }
}
