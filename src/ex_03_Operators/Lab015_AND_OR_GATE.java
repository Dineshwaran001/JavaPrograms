package ex_03_Operators;

public class Lab015_AND_OR_GATE {
    public static void main(String[] args) {
        boolean a = true && true; // AND only return true if they are true remaining are false
        boolean b = true && false;
        boolean c = false && true;
        boolean d = false && false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        boolean e = true || true; // OR return true if any one value are true remaining are false
        boolean f = true || false;
        boolean g = false || true;
        boolean h = false || false;
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
