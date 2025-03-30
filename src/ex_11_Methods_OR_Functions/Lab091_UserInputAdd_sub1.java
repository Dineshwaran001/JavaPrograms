package ex_11_Methods_OR_Functions;

import java.util.Scanner;

public class Lab091_UserInputAdd_sub1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=0; // we have to initialize outside to use-> you cannot use local variable without initializing
        if (scan.hasNextInt()){ // this loop will enter only we type integer value
         a = scan.nextInt(); // this will scan our input and store it in -->a
        }else { // if we type words it will execute else
            System.out.println("Enter only numbers");
            System.exit(0);// it will exit the program
        }

        System.out.println("Enter the Second number");
        int b=0;
        if (scan.hasNextInt()){
            b = scan.nextInt();
        }else {
            System.out.println("Enter only numbers");
            System.exit(0);
        }

        int result= addition(a,b);
        int result1= subtraction(a,b);
        int result2= multiplication(a,b);
        int result3= division(a,b);
        int result4= modulus(a,b);

        System.out.println("Addition result -->"+result);
        System.out.println("sub result -->"+result1);
        System.out.println("mult result -->"+result2);
        System.out.println("div result -->"+result3);
        System.out.println("mod result -->"+result4);

    }
    static int addition(int a, int b){
        return a+b;
    }
    static int subtraction(int a, int b){
        return a-b;
    }
    static int division(int a, int b){
        if (b==0){
            System.out.println("divide by zero not allowed");
            System.exit(0);
        }
        return a/b;
    }
    static int multiplication(int a, int b){
        return a*b;
    }
    static int modulus(int a, int b){
        return a%b;
    }
}
