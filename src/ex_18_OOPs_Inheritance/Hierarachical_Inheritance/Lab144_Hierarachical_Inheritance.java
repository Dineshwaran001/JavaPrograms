package ex_18_OOPs_Inheritance.Hierarachical_Inheritance;

public class Lab144_Hierarachical_Inheritance {
    public static void main(String[] args) {
        Father f1= new Father();
       // f1.house();
        System.out.println("Multiple Derived class inherit from a single Base class");
        System.out.println("__________________________________");
        Daughter1 d1 = new Daughter1();
        System.out.println("Daughter will have acces to the father property");
        d1.house();
        System.out.println("__________________________________");
        Son1 s1 = new Son1();
        System.out.println("Son1 will have acces to the father property");
        s1.house();
        System.out.println("__________________________________");
        Son2 s2 = new Son2();
        System.out.println("Son2 will have acces to the father property");
        s2.house();
    }
}
