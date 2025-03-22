package ex_06_If_Condition;

import java.util.Scanner;

public class Lab040_IfAndElseIfUsages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scan.nextInt();
         if(age>18){
             System.out.println("you can go out with friends");
         } else if (age==18) {
             System.out.println("next year you are allowed or after turned 19 you are allowed");
         } else{
             System.out.println("You cannot allowed until you are 19");
         }


    }
}
