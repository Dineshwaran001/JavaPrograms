package ex_03_TypeCasting;

public class Lab019_WideningImplicitExplicit {
    public static void main(String[] args) {
        byte a = 11;//Widening->implicit--> JVM will not throw error because it is valid
        int b= a; // It is storing smaller data type into bigger data type
        System.out.println(b);

        byte c =12;//Widening->Explicit
        int d =(int)c; // This is also work but not neccessary to give Explicitly while converting small to big data type
        System.out.println(d);
    }
}
