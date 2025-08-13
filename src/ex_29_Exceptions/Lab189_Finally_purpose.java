package ex_29_Exceptions;

import java.util.Scanner;

public class Lab189_Finally_purpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();

        try {
            int b=10/v;
            System.out.println("Try block"+" "+ b);
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("purpose is whether it is exception or not we need to close Scanner class");
            sc.close();
        }
    }
}
