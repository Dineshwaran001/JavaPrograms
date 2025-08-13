package ex_19_Polymorphism;

public class Lab147_Polymorphism_Method_Overloading {
    public static void main(String[] args) {
        System.out.println("It is a relationship between methods in a same class");
        System.out.println("The function name is same(add) but the functionality is diffrent");
        System.out.println("this is like constructor overloading");
        System.out.println("same method names but diffrent argument passing");

        MathOperation m1 = new MathOperation(); // calling the class and using class call method
        int add1 = m1.add(2,3); // same method name add storing in int add1
        int add2 = m1.add(2,3,5);// same method name add storing in int add2
        double add3 = m1.add(1.3,2.0);// same method name add storing in double add3
        System.out.println(add1);
        System.out.println(add2);
        System.out.println(add3);

    }
}
class MathOperation{
    int add(int a , int b){
        return a+b;
    }
    int add(int a , int b, int c){
        return a+b;
    }
    double add(double a , double b){
        return a+b;
    }
}
