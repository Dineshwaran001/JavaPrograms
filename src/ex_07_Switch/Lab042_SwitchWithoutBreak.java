package ex_07_Switch;

import java.util.Scanner;

public class Lab042_SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day number 1 to 7 - Monday to Sunday");
        int day = scan.nextInt();
        //if we dont use the break i will execute remaining conditions also
        //thats why we use break; in every statement
        // there is no way to go outside
        // if we dont enter default and give the number which is not here -->nothing will happen
        switch (day){
            case 1:
                System.out.println("Today is Monday");
            case 2:
                System.out.println("Today is Tuesday");
            case 3:
                System.out.println("Today is Wednesday");
            case 4:
                System.out.println("Today is Thursday");
            case 5:
                System.out.println("Today is Friday");
            case 6:
                System.out.println("Today is Saturday");
            case 7:
                System.out.println("Today is Sunday");
            default:
                System.out.println("There is only 7 days in a week");
                }
    }
}
