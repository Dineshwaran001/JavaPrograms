package ex_07_Switch;

import java.util.Scanner;

public class Lab41_Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day number 1 to 7 - Monday to Sunday");
        int day = scan.nextInt();
        switch (day){// condition which will given here need should match with case that is going to print
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
            break;
                case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("There is only 7 days in a week");
                break;
        }

    }
}
