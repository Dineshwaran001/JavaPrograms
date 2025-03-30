package ex_10_Do_While;

public class Lab084_DoWhile_Base {
    public static void main(String[] args) {
        int i =1;
        do {
            System.out.println("one time printed");
            i++;
        }while (i>10);// 1>10 is false
        // even though the condition is fals e the loop will execute one time
    }
}
