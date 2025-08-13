package ex_29_Exceptions;

public class Lab185_TryCatchMultiplePossible_IQ {
    public static void main(String[] args) {
        try {
            String s1 = null;
            s1.trim();
            int a = 10/0;
        } catch(ArithmeticException | NullPointerException e){ // we can give instance at last--> e
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
