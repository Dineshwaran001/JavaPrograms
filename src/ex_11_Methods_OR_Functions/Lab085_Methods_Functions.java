package ex_11_Methods_OR_Functions;

public class Lab085_Methods_Functions {
    static void new_Function(){ //this is called method or function we can use
        System.out.println("This is new function");
    }

    public static void main(String[] args) {
new_Function();// calling the method or functions
after_mainMethod(); //calling the method or functions
    }

    static void after_mainMethod(){
        System.out.println("this is written after main method");
    }
}
