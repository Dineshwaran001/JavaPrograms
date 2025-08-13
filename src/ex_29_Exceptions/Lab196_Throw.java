package ex_29_Exceptions;

public class Lab196_Throw {
    public static void main(String[] args) {
        System.out.println("We throwing an exception using Throw");
        Lab196_Throw.divideByZero(0);

    }

    static void divideByZero(int a ){
        // check some
        if ( a == 0){
            throw new ArithmeticException(); //
        }

    }
}
