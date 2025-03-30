package ex_11_Methods_OR_Functions;

public class Lab089_DiffrentMainFunctions {
    public static void main(String[] args) {

        main("hi");
       int ma = main(11);// stored and print  that value give the return value
        System.out.println(ma);
        double do1 = main(55.3d);// stored and print  that value give the return value
        System.out.println(do1);
    }
    public static void main(String args) {
        System.out.println("[] diffrent arguments it will allow");
    }
    public static int main(int args) {
        System.out.println("int arg it will allow");
        return 1;
    }
    public static double main(double args) {
        System.out.println("double or anything it will allow");
        return 38.1d;
    }
}

