package ex_08_For_Loop;

public class Lab070_Condition_Outside_Boolean {
    public static void main(String[] args) {
        int i= 10; // initialization and condition we can do outside also
        Boolean j= i>0; //here we give condition 10>0 it is true and it will go infinite
        for (;j;i--){
            System.out.println(i);
         //because of also condition outside it will go infinite
            /*
            * Inside the loop, you decrement i (i--), but j is never updated inside the loop.
            *  As long as i is greater than or equal to 0, j remains true,
            *  causing the loop to continue indefinitely.
            * There is no check to change the value of j once the loop begins,
            *  and i keeps decrementing, but since j is still true, the loop never stops.
            * */
        }
    }
}
