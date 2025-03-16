package ex_03_Operators;

public class Lab010_ModulusOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        System.out.println(a%b); // this will work like a division and in output give remainder not quotient
         //20 divide by 10
         //  10 /20 /2 (10 twos are 20 --> 2 are quotient)
        //     /20
        // _________
        //      0- Remainder

        System.out.println(15%7);// 7 twos are 14 remainder will be 1
        System.out.println(13%7);// 7 ones are 7 remainder will be 6
    }
}
