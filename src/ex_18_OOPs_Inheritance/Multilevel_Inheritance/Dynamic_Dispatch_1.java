package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Dynamic_Dispatch_1 {
    public static void main(String[] args) {
        M01_GrandFather g1 = new M01_GrandFather();// normal object
        System.out.println("Usage of Dynamic Dispatch");
        System.out.println("Suppose we have have common Properties/Variables  and Function/ method --> home");
        System.out.println("whichever the object is in right side that function will called");

        M01_GrandFather g2 = new M02_Father();
        g2.home();//// ref is GF but object is Father so it will go to Father home
        System.out.println("ref is GF but object is Father so it will go to Father home");
        M01_GrandFather g3 = new M03_Son();
        g3.home();// ref is GF but object is son so it will go to son home
        System.out.println("ref is GF but object is son so it will go to son home");
        M02_Father f1 = new M02_Father();// normal object
        M02_Father f2 = new M03_Son();
        f2.home();// ref is father but object is son so it will go to son home
        System.out.println("ref is father but object is son so it will go to son home");
    }
}
