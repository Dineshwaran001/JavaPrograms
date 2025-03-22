package ex_05_IncrementDecrementOperator;

public class Lab31_PrePostIncrement {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a);// 11
        System.out.println(a);// a value changed from 10 to 11
        int b= 20;
        System.out.println(b++);// this only assign the value not increment
        System.out.println(b); // if check again aded value shown

        int c =30;
        int d =c++; // it will assign value 30 to d and add in the c-->30+1= 31
        System.out.println(c);//31
        System.out.println(d);//30

    }
}
