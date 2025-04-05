package task_Daily;

import java.util.Scanner;

public class Task012_Vowels_Count_check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the words to check it vowels or not");
        String Userinput = scan.nextLine();// use Stringline to check consonant

        String input = Userinput.toLowerCase(); // change here to lower case for vowels
        int vowelCount = 0; //create a local variable for counting start from 0
        int consonantCount= 0;//create a local variable for counting
        for (int i = 0; i <input.length() ; i++) {
            char ch = input.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("Vowel----->"+ch);
                vowelCount =vowelCount + 1; //use that local variable here(it enter the loop it start count from 1)
            } else {
                System.out.println("Constant--->"+ input.charAt(i));
                consonantCount = consonantCount+1;//use that local variable here
            }

        }
        System.out.println("Total vowel ="+vowelCount);//
        System.out.println("Total constant ="+consonantCount);
    }
}
