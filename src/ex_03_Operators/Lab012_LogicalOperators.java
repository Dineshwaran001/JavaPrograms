package ex_03_Operators;

public class Lab012_LogicalOperators {

    public static void main(String[] args) {
        Boolean a = true;
        System.out.println(!a);// this will return opposite
        System.out.println(!!a);// first! it will change to false second ! it will change to true again

        System.out.println(!(10>10));// 10>10 false and ! will change to true


        boolean c = true || false; // this is or gate so either one of them is true it will retun true
        System.out.println(c);

    }

}
