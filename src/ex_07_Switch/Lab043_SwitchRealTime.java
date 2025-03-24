package ex_07_Switch;

import java.util.Scanner;

public class Lab043_SwitchRealTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String browser = scan.next();
        scan.nextLine();
         switch (browser){
              //Case name are case Sensitive give the correct name input
             case "Chrome":
                 System.out.println("Chrome browser opened");
                 System.out.println("Started using First Testcase");
                 System.out.println("Started using Second Testcase");
                 break;
             case "FireFox":
                 System.out.println("FireFox browser opened");
                 System.out.println("Started using First Testcase");
                 System.out.println("Started using Second Testcase");
                 break;
             case "Edge":
                 System.out.println("Edge browser opened");
                 System.out.println("Started using First Testcase");
                 System.out.println("Started using Second Testcase");
                 break;
             default:
                 System.out.println("Browser not matched");
         }

    }
}
