package ex_06_If_Condition;

import java.util.Scanner;

public class Lab039_IfAndElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        } else {
            System.out.println("You cant vote until your age is 18");
        }
    }
}
