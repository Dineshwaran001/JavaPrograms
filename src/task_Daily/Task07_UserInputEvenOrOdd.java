package task_Daily;

import java.util.Scanner;

public class Task07_UserInputEvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int get = scan.nextInt();
        int number = get % 2 ;
        if(number==0){
            System.out.println("It is Even number");
        }else {
            System.out.println("It is odd");
        }
    }
}
