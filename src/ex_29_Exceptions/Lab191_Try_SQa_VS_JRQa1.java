package ex_29_Exceptions;

public class Lab191_Try_SQa_VS_JRQa1 {
    public static void main(String[] args) {


        // Jr_QA or QA
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
        } catch (Exception e) { // when you have no idea you can use this
            System.out.println(e.getMessage());
        }


    }
}
