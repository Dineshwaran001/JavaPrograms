package ex_05_IncrementDecrementOperator;

public class Lab033_PrePostInc {
    public static void main(String[] args) {
        int a =10;

        System.out.println(a++ + ++a); //10+12= 22
        System.out.println(a);// 12
        //a++ =10--> after this statement--> a value is changed 11
        //+ (addition)
        //++a = a  value is already changed to 11 then 11+1 =12 ++a valuue is 12
        //a++ =10 + ++a =12; total 22
    }
}
