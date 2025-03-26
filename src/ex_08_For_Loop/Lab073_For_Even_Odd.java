package ex_08_For_Loop;

public class Lab073_For_Even_Odd {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if (i%2==0){
                System.out.println("This is even-->" + i);
            } // else condition is optional you can use or not--> your wish
            else {
                System.out.println("This is Odd-->" + i);
            }

        }
    }
}
