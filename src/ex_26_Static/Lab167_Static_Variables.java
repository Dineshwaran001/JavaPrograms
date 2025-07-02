package ex_26_Static;

public class Lab167_Static_Variables {
    public static void main(String[] args) {
        Z ref = new Z(10);
        ref.valueDisplay();
        System.out.println(ref.b);// it will not change
        Z ref2 = new Z(20);
        ref2.valueDisplay();
        System.out.println(ref2.b);// it will not change
        System.out.println("It belong to class so you can print using class also not reference");
        System.out.println("Check below code");
        System.out.println("Using class---->"+ Z.b);

        Z.b=100; // it will change here to 100 (it is like a black board)
        Z ref3 = new Z(70);
        System.out.println(ref3.b);
        System.out.println("Using class---->"+Z.b);
    }
}

class Z{
    int a;
    static int b =50;
Z(int a){
    this.a =a;
}

void valueDisplay(){
    System.out.println(this.a);
}
}