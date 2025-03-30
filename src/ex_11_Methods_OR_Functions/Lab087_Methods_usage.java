package ex_11_Methods_OR_Functions;

public class Lab087_Methods_usage {
    public static void main(String[] args) {
        int sum_of_Value =intdatatype(3,5); //here you cans see we use same data type
        int sum_of_Value1 =intdatatype(10,5);//intdatatype and use it two times with diffent ref varibales
        System.out.println("Usage of methods or function is code Reusability");
        System.out.println("with one function below we can use it again and again");
        System.out.println(sum_of_Value);
        System.out.println(sum_of_Value1);
    }
    static int intdatatype(int a, int b){// we can declare here
        // main("Dinesh"); you cannot call main mehtod inside another method
        //JVM will confuse
        return a+b;
    }
}
