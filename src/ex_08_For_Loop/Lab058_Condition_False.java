package ex_08_For_Loop;

public class Lab058_Condition_False {
    public static void main(String[] args) {
        for (int i=0; i>10; ){ // syntax is fine but 0>10 Condition is false so it couldnt go inside
            System.out.println("Condition is false so it couldnt go inside");
            // if condition is 0<10 then it will go infinite
        }
    }
}
