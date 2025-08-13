package ex_28_WrapperClass;

public class Lab176_Wrapper_Conversion {
    public static void main(String[] args) {

        String num = "10"; // convert this into int

        //String to Wrapper(Integer)
        // using ParseInt method (or) valueOf method
        Integer a = Integer.parseInt(num); // 1st way
        Integer b = Integer.valueOf(num); // 2nd way
        System.out.println(a);
        System.out.println(b);

       //String to primitive data type (int) also using ParseInt method(Wrapper)
        int c = Integer.parseInt(num);
        System.out.println(c);

        //Wrapper to String use toString method
          String d = a.toString();
        System.out.println(d);

          //primitive to String
        int age = 25;
        Integer wrap = age;
        String s = wrap.toString();
        System.out.println(s);
    }
}
