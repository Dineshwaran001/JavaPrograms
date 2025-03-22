package task_Daily;

import java.util.Scanner;

public class Task02_Grades1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mark1 = scan.nextInt();

        String result =(mark1 >=90)? "Grade A":(mark1>=80)? "Grade B": (mark1>=70)? "Grade C" :(mark1>=60)?"Grade D":"Fail";
        System.out.println("Your mark is "+mark1 +" " + result);
    }
}
