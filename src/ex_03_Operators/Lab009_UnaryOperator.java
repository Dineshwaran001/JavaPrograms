package ex_03_Operators;

public class Lab009_UnaryOperator {
    public static void main(String[] args) {
         int a = +10;  // this plus will not be printed
         int b = -20;  // this minus will be printed
         int result = a+b;     // 10-20 =-10
        System.out.println(a); // this plus will not be printed
        System.out.println(b); // this minus will be printed
        System.out.println(result);// 10-20 =-10

        int c = -1;
        c= c + 1;  // c value is -1 and here we add +1 (+1 -1= 0 will the answer)
    }
}
