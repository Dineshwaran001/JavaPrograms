package ex_31_MultiThreading;

public class Lab228_Generics_Method {

    public static <DT extends  Comparable<DT>> DT maximum(DT a, DT b, DT c){
        DT max = a;
        if (b.compareTo(max)>0){
            max = b;
        }
        if (c.compareTo(max)>0){
            max = b;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximum(80, 30, 50)) ;
        System.out.println(maximum('a', 'Z', 'z'));
        System.out.println(maximum("Dinesh", "Waran", "DADA"));
    }
}
