package ex_11_Methods_OR_Functions;

public class Lab086_Sample_Methods_Functions {
    public static void main(String[] args) {
       // int void_datatpe =no_return(); you cannot assign to a value because called function is void
        //System.out.println(string_datatype1());

   int result=int_datatype(); // try to always assign a value and calling it
        System.out.println(result);// while it return something
   float float1= float_datatype();
        System.out.println(float1);
   long long1= long_datatype();
        System.out.println(long1);
   String string = string_datatype();
        System.out.println(string);
        string_datatype1();
    }
    static void no_return(){
        //System.out.println("this will no return because void is there");
    }
    static int int_datatype(){
        return 10;
    }
    static float float_datatype(){
        return 10.56f;
    }
    static long long_datatype(){
       return 1000L;
    }
    static String string_datatype(){
        return "If you dont return anything it will throw error";
    }
    static String string_datatype1(){
        return "you can directly also call but try to assign the value and call like below code";
    }

}
