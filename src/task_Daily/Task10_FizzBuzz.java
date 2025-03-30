package task_Daily;

import java.util.Scanner;

public class Task10_FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number%3==0 && number%5==0){
            System.out.println("It is Fizz Buzz"); //eg 15
        } else if (number%3==0) {
            System.out.println("Fizz");
        } else if (number%5==0) {
            System.out.println("Buzz");
        }else {
            System.out.println("none of it");
        }
    }
}
