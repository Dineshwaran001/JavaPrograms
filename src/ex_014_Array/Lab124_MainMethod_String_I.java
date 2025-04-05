package ex_014_Array;

public class Lab124_MainMethod_String_I {
    public static void main(String[] args) { // we are using this arg  in our pgm using CLI option
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
            //CLI will take ulimited number of arguments you give
        }
    }
}
