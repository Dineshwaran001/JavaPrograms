package ex_15_TwoD_Array;

public class Lab130_LeftTriangle {
    public static void main(String[] args) {

        for (int  num = 5; num>0 ; num--) { //row start 5 stars
            for (int j = 1; j<=num; j++) { // from below start from 1 star
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //It will start from inside 5
}
