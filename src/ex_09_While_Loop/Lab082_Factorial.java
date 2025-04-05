package ex_09_While_Loop;

import java.util.Scanner;

public class Lab082_Factorial {
    public static void main(String[] args) {
//       Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the factorial number you want output");
//        int number= scan.nextInt();
        int number =5;
        int factorial = 1;
        if (number<=0){
            System.out.println(factorial);
        } else {
            for (int i = 1; i <= number ; i++) {// condition given number<= number
                factorial = factorial *i; // we multiply here with fatorial =1 and i=1
                //1*1 =1 *2 =2*3 =6*4 =24 *5= 120
            }
        }
        System.out.println("Factorial number is "+ factorial);
    }
}
