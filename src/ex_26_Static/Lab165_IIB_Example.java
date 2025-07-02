package ex_26_Static;

public class Lab165_IIB_Example {
    public static void main(String[] args) {
        //IIB instance intializing Block
//A a = new A(); // this will also call the IIb
        new A();// this will also call the IIb
    }
}
     class A{
        A(){
            System.out.println("Default constructor");
        }

         {
             System.out.println("it is IIb first one automatically called when object is created");
         }

         {
             System.out.println("same like constructor but the execution takes IIb first");
         }
         {
             System.out.println("you can create n number of IIb block");
         }
     }

