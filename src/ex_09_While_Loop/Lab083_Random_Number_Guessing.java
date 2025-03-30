package ex_09_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab083_Random_Number_Guessing {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10)+1; // +1 for to include 10 also -> 0 to 10
        System.out.println("Here is random number--> "+ randomNumber);
        // remove about sout statement and try
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int count =0;
        while (true){
            guess = scan.nextInt();
            count++;

            if(guess < randomNumber){ // here we compare our guess number with
                System.out.println("Number Entered is Low than Guessed");
            } else if (guess > randomNumber) {
                System.out.println("Number Entered is HIGHER than Guessed");
            }else {
                System.out.println("your attempt total attempt "+ count +" and the guessed number is "+ guess);
            }
        }
    }
}
