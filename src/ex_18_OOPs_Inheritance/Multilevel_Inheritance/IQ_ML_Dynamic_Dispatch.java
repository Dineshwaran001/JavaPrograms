package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class IQ_ML_Dynamic_Dispatch {

    public static void main(String[] args) {
        //    M03_Son s1  = new M01_GrandFather();
//    M03_Son s2  = new M02_Father();
        System.out.println("son is not present when the GF or F is born");
        M03_Son s3 = new M03_Son();

        System.out.println("_________________________________________");
        M01_GrandFather g1 = new M03_Son();
        System.out.println("GF is Present when Grandson is born");
        M01_GrandFather g2 = new M02_Father();
        System.out.println("GF is Present when son is born");
        M01_GrandFather g3 = new M01_GrandFather();
        System.out.println("GF is Present when GF is born");
        System.out.println("_________________________________________");
//        M02_Father m1 = new M01_GrandFather(); F is not Present when GF is born
        M02_Father m2 = new M02_Father();
        System.out.println("Father is present when he is born");
        M02_Father m3 = new M03_Son();
        System.out.println("Father is present when he is born");
        System.out.println("____________________________________________");

        System.out.println("This means you can have GF reference in F or Son object");
        // eg; WebDriver driver = new ChromeDriver();


        System.out.println("Reference you use GF or F but you cannot access Son ");
        M01_GrandFather g4 = new M03_Son();
           g4.grand_Father_Property();
        System.out.println("only you can access your property");

    }
}
