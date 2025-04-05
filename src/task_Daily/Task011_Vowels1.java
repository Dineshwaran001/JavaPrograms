package task_Daily;

import java.util.Scanner;

public class Task011_Vowels1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the words you want to check vowels or consonant");
        String vowel = scan.next();
        vowel.toLowerCase();

        for (int i = 0; i <vowel.length() ; i++) {
           char c =  vowel.charAt(i);
            if (c=='a'|| c=='e'||c=='i'||c=='o'||c=='u'){
                System.out.println("Vowel     -->"+ c);
            }else {
                System.out.println("Consonants -->"+vowel.charAt(i));
            }

        }
    }
}
