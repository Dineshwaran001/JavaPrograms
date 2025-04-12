package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Dynamic_Dispatch_Eg2 {
    public static void main(String[] args) {
        System.out.println("Usage of Dynamic Dispatch");
        System.out.println("Suppose we have have common Properties/Variables  and Function/ method --> home");
        System.out.println("whichever the object is in right side that function will called");
        System.out.println("____________________________________________________________");
        M01_GrandFather gf = new M03_Son();
        gf.home();
        System.out.println("____________________________________________________________");
        System.out.println("It will print GF 1bhk home because object is son");
        System.out.println("suppose we comment the son's home it will point to Father 2bhk");
        System.out.println("suppose we comment the Father home it will point to GF(own) 1bhk");
        System.out.println("It will go search from Bottom to TOP");
        System.out.println("to avoid this confusion we use correct object on right side");
    }
}
