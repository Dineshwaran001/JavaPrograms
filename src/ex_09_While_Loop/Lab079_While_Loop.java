package ex_09_While_Loop;

public class Lab079_While_Loop {
    public static void main(String[] args) {
        // it is called Entry controlled loop-> if u want to enter condition must be true
        // reference name can be anything i or dines or _1
        int i=0; // initialization first-->must be outside
        while (i<10) // condition()--> must be true to Enter the loop
        {
            System.out.println("inside the loop" + i);
            i++; // Updation--> inside the loop
        }

    }
}
