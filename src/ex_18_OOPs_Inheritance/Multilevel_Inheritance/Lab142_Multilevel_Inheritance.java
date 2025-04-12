package ex_18_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab142_Multilevel_Inheritance {
    public static void main(String[] args) {
        M03_Son s1 = new M03_Son();
        s1.grand_Father_Property();
        s1.Father_Property();
        s1.Son();
        System.out.println("Son can access all property of GF , F and his own");
        M02_Father f1 = new M02_Father();
        f1.grand_Father_Property();
        f1.Father_Property();
        System.out.println("Father can access  property of GF and his own not SON");
        M01_GrandFather g1 = new M01_GrandFather();
        g1.grand_Father_Property();
        System.out.println("GF can access  property of his own not GrandSON , or father(his son)");

    }
}
