package ex_30_Generics;

public class Lab199_Generic_method {
    public static void main(String[] args) {
        methodOne(1, 2);
        methodOne(2.00, 3.00);
        methodOne("Dinesh", "Waran");
    }
    static <Generic> Generic methodOne(Generic a, Generic b) {
        System.out.println("generally we define the data type jvm will automatically assign data type");
        System.out.println(a + " " + b);
        return null;
    }
}
