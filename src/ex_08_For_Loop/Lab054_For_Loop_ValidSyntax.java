package ex_08_For_Loop;

public class Lab054_For_Loop_ValidSyntax {
    public static void main(String[] args) {
         // _1 is the variable name
        for(int _1=0; _1<=10; _1++){
            System.out.println(_1);
            //this is valid Syntax and it will print
        }

        System.out.println("First loop completed");
        for(int j=0; j>1; j++){ // 0>1 condition failed
            System.out.println(j);
            // This loop never run
        }
        System.out.println("End");
    }
}
