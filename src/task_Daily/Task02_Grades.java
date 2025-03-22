package task_Daily;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task02_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        int gradeA = 90;
        int gradeB = 89;
        int gradeC = 79;
        int gradeD = 69;
        if (mark>=gradeA){
            System.out.println("Your mark is " +mark+ " Grade A");
        } else if (mark>=gradeB) {
            System.out.println("Your mark is " +mark +"Grade B");
        } else if (mark>=gradeC) {
            System.out.println("Your mark is " +mark+ "Grade C");
        } else if (mark>=gradeD) {
            System.out.println("Your mark is " +mark +"Grade D");
        } else if (mark<gradeD) {
            System.out.println("Your mark is " +mark +"Fail");
        }
    }
        }





