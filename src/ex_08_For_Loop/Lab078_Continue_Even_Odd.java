package ex_08_For_Loop;

public class Lab078_Continue_Even_Odd {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i%2==0){
                System.out.println("Even number"+ i);// first we print and continue
                continue;
            }
            System.out.println("Odd number"+ i); //if i%2 this will execute
        }
    }
}
