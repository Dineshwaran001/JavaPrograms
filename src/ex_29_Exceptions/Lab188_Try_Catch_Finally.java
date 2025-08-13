package ex_29_Exceptions;

public class Lab188_Try_Catch_Finally {
    public static void main(String[] args) {
        int a =1;
        int c= 4;
        try {
            c= c/2;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("whether it will go to try or catch block ");
            System.out.println("It will Execute");
        }
    }
}
