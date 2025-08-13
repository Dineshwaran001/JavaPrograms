package ex_29_Exceptions;

public class Lab192_Try_SQa_VS_JRQa2 {
    public static void main(String[] args) {

        // Sr. QA
        try {
            String ip = args[0]; // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip); // NumberFormatException
            int b = 100 / a; // ArithmeticException
            System.out.println(b);
            //for all the exception we use |(or) between them and e at last for reference
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


    }
}
