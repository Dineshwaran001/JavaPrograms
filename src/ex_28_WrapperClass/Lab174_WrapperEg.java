package ex_28_WrapperClass;

public class Lab174_WrapperEg {

    public static void main(String[] args) {
        int a = 10;
        Integer b = a;// this is Auto Boxing //JVM will store the value primitive to wrapper automatically done
        System.out.println(b.byteValue());// we can have behaviour

        Integer c =20;
        int d = c;// wrapper is removed , attribute and behaviour is lost
        System.out.println(d);
    }
}
