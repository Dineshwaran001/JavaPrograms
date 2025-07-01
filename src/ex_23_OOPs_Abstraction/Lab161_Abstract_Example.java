package ex_23_OOPs_Abstraction;

public class Lab161_Abstract_Example {
    public static void main(String[] args) {

    }
}
 abstract class Employee{
    private String name;
     private int id;
     private String position;

     Employee(){
         System.out.println("it is default constructor");
     }
     Employee(String name,  int id, String position){
         System.out.println("it is param constructor");
         System.out.println("Employee details");
         this.id = id;
         this.name= name;
         this.position= position;
     }
       abstract void payout(); // this is abstract method

     void mailBox(){
         System.out.println("this is normal method");
     }
 }