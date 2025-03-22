package ex_05_IncrementDecrementOperator;

public class Lab036_PostDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a-- + a--);
        System.out.println(a);
        // a-- = 10 after this a changed to 9
        // +
        // a-- = 9 after this a changed to 8
       // total a-- + a-- = 10 +9
        //a values is 8

    }
}
