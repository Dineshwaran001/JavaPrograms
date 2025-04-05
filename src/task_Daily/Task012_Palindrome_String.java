package task_Daily;

import java.util.Scanner;

public class Task012_Palindrome_String {
    public static void main(String[] args) {
        // madam //  Malayalam-> Palindrome
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the input you need to check it is a palindrome");
        String userInput = scan.next();

        String output = stringReverse(userInput);//create method pass userInput and store it in output
        if (output.equalsIgnoreCase(userInput)) {// it will remove case sensitive and compare
            System.out.println("It is  a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }

    private static String stringReverse(String userInput) {//pass userInput here
        String reversed = "";
        for (int i = userInput.length() - 1; i >= 0; i--) {
            reversed = reversed + userInput.charAt(i);
        }
        return reversed; // return should be here ->is should be within the method not loop

    }
}




