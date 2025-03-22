package ex_06_If_Condition;

import java.util.Scanner;

public class Lab037_If_Basic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age =scan.nextInt();

        if (age>= 18){
            System.out.println("you can vote");
        }
        // if you give correct value it will go inside otherwise there is no output
        //else condition is optional
    }
}
