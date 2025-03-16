package ex_03_Operators;

public class Lab018_ASCII_Value {
    public static void main(String[] args) {
        char a ='A'; // ASCII -> 65
        char b = 'B';// ASCII -> 66
        System.out.println(a+b);
        //Char are integral data type so they will return numbers

        System.out.println('A'== 65); // it is true becasue A, ASCII value is 65
        System.out.println('B'== 66);// it is true becasue B, ASCII value is 66

        short k =10;
        char c ='A'; // short value 10 + c value A is 65--> 10+65 =75
        System.out.println(c+k);

    }
}
