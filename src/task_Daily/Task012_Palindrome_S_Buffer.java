package task_Daily;

import java.util.Scanner;

public class Task012_Palindrome_S_Buffer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to check it is palindrome or not");
        String userInput = scan.next();

        String output = stringReverse(userInput);
        if (output.equalsIgnoreCase(userInput)){
            System.out.println("it is palindrome");
        }else {
            System.out.println("it is not a palindrome");
        }
    }

    private static String stringReverse(String userInput) {
        StringBuffer stringBuffer= new StringBuffer(userInput);
        return stringBuffer.reverse().toString();
    }

}
