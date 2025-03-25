package ex_08_For_Loop;

public class Lab053_For_loop {
    public static void main(String[] args) {
        //For loop will help you to repeat a block of code
        // [ICU]Initialization ->condition ->updation (Incre/ Decre)
        //these order cannot be changed -->ICU
        for(int i=0; i<10; i++){
            System.out.println(i);// this will print 0 to 9 total 10 times
        }
        System.out.println("i loop finished j loop started");
        for(int j=0; j<=10; j++){
            System.out.println(j);// this will print 1 to 10 total 10 times
        }
    }
}
