package task_Daily;

import java.util.Scanner;

public class Task011_Vowels {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter your name");
//        String name = scan.next();
        String name = "dinesh"; //
        int vowelCount = 0;
        for (int i = 0; i <name.length() ; i++) {
            //below we check name with charAt i-->0,1,2,3,4,5
           char ch =name.charAt(i); // this is to check char at 0,1,2,3,4,5->dinesh
            if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                System.out.println("These are the vowels in word given-->"+ ch);
                vowelCount++;
            }

        }
        System.out.println("Total vowels are" +vowelCount);
    }
}
