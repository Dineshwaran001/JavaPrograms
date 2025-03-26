package ex_08_For_Loop;

public class Lab074_For_Break_Condition {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==6){// once i becomes 6 it will break out of the loop
                break;
            }
            System.out.println(i);// this is inside for loop for print
        }
    }
}
