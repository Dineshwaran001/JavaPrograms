package ex_26_Static;

public class Lab166_Static_Block_SIB {
    public static void main(String[] args) {
        B b = new B();
        //First B (class)will be loaded so SIB executed
        //second object is created so IIB executed
        // third Constructor will executed
       // new B(); --> this will also work to create the object class needs to load so(it will work)
    }
}

class B{
    B(){
        System.out.println("Default constructor"); // third
    }
    {
        System.out.println("IIB");// second

    }
    static{
        System.out.println("SIB");// first
    }
}