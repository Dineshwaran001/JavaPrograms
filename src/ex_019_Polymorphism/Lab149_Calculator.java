package ex_019_Polymorphism;

public class Lab149_Calculator {
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Lab149_Calculator c = new Lab149_Calculator();
        int add1= c.add(5,6);
        double add2= c.add(5.55,6.66);
        System.out.println(add1);
        System.out.println(add2);
    }
}
