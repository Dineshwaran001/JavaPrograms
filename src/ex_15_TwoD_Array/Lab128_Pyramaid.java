package ex_15_TwoD_Array;

public class Lab128_Pyramaid {
    public static void main(String[] args) {
        int n= 4;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= n-1 ; j++) {
                    System.out.print(" ");
                for (int k = 1; k <=(2*i-1) ; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
